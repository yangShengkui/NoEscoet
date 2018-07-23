package com.slk.wph.framework.Interceptor.AccessIntercept;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class CheckDataUrlDataInterceptor extends HandlerInterceptorAdapter{
    
private static Logger logger = LogManager.getLogger(CheckDataUrlDataInterceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            Token   annotation = method.getAnnotation(Token.class);
            if (annotation != null) {
                boolean needSaveSession = annotation.save();
                if (needSaveSession) {
                    request.getSession(true).setAttribute("token", UUID.randomUUID().toString());
                    request.getSession(true).setAttribute("testPath",request.getServletPath());
                    System.out.println(request.getQueryString());
                }
                boolean needRemoveSession = annotation.remove();
                if (needRemoveSession) {
                    if (isRepeatSubmit(request)) {
                    	logger.warn("please don't repeat submit,url:"+ request.getServletPath());
                     	System.out.println("不能重复提交申请页面:"+request.getServletPath());
//                         throw new CustomException("不能重复提交申请页面！");
                    	PrintWriter out = response.getWriter();
                    	out.println("<html>");
                		out.println("<script>");
                		System.out.println(request.getSession(true).getAttribute("testPath")+"?message=恭喜您操作成功");
                		out.println("window.open('"+request.getSession(true).getAttribute("testPath")+"?message=恭喜您操作成功" +"','_self')");
                		out.println("</script>");
                		out.println("</html>");
                        return false; 
                        
                    }
                    request.getSession(true).removeAttribute("token");
                }
            }
            return true;
        } else {
            return super.preHandle(request, response, handler);
        }
    }

    private boolean isRepeatSubmit(HttpServletRequest request) {
        String serverToken = (String) request.getSession(true).getAttribute("token");
        if (serverToken == null) {
            return true;
        }
        String clinetToken = request.getParameter("token");
        if (clinetToken == null) {
            return true;
        }
        if (!serverToken.equals(clinetToken)) {
            return true;
        }
        return false;
    }

}
