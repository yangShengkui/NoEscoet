package com.slk.wph.framework.Interceptor.AccessIntercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;
import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;

public class PrivilegeInterceptor implements HandlerInterceptor{

	@Autowired
	WPH_MenuService  service;
	
	/**
	 * 执行此方法 进入handler/controller方法之前执行
	 * 	常用于，身份验证授权等操作，返回false表示不通过
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object object) throws Exception {

		HttpSession session = request.getSession();
		WphMenuCustom custom = new WphMenuCustom();
		String url = request.getServletPath();
		Object UserFID = session.getAttribute("userFID");
		
		if(!priv.license.DecodeLicense.Decode()) {
			response.sendRedirect("/code/promptNO.jsp");
			return false;
		}
			
		
		if(url.indexOf("UserLogin")>0 || url.indexOf("One_Login")>0 ||url.indexOf("Screen")>0 || url.indexOf("MealSummary")>0 || url.indexOf("Prepcustomer")>0)return true;
		if(null != UserFID && (Integer)UserFID == 1)return true;
		if(null != UserFID)
		custom.setUserFid((Integer)UserFID);
		
		custom.setMenuurl(url.substring(url.indexOf("/"), url.indexOf("/", 1)+1));
		
		if(service.getCountByUrlUserIds(custom) != 0)
			return true;
		else 
			response.sendRedirect("/code/promptNO.jsp");//没有权限
		
		return false;
	}

	
	//进入handler/controller方法之后，返回ModelAndView之前执行
	//可以将公用的模型数据在此方法传到视图，也可以统一制定视图
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView modelAndView) throws Exception {
		
	}

	//进入handler/controller方法，执行handler完成后执行
	//可以统一异常处理、日志处理等
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object object, Exception exception)throws Exception {
		
//		System.out.println("LoginInterceptor---------afterCompletion-");
		
	}



}
