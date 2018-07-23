package com.slk.wph.framework.Exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理器
 * @author LeLE
 *
 */
public class CustimExceptionResolver implements HandlerExceptionResolver {
	
	 private static Logger logger = LogManager.getLogger(CustimExceptionResolver.class);
	
	/**
	 * @param object object就是异常处理器要执行的Handler对象(只有method)
	 * @param ex 是系统抛出的异常
	 */
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception ex) {
		// TODO Auto-generated method stub
		
		
		CustomException customException =null;
		System.out.println(ex.getMessage());
		ex.printStackTrace();
		//如果该异常时系统自定义异常，直接抛出异常信息在错误页面
		//如果该异常不是系统自定义异常，则构造一个自定义的异常（信息为“未知错误”）
		if(ex instanceof CustomException){
			customException=(CustomException)ex;
			
		}else{
			customException=new CustomException("未知错误");
		}
		String customMessage= customException.getCustomMessage();
		ModelAndView modelAndView = new ModelAndView("forward:/login.jsp");
		StackTraceElement[] stackTrace = ex.getStackTrace();
		
		modelAndView.addObject("stackTrace",stackTrace);
		modelAndView.addObject("ex",ex);
		modelAndView.addObject("customMessage", customMessage);
		
		modelAndView.addObject("object", object);
		modelAndView.addObject("message", "用户登录状态失效，请重新登录哦！");
		logger.error("-------------Exception------");
		logger.error(ex.getStackTrace());
		logger.error(customMessage);
		logger.error(ex);
		logger.error(object);
		logger.error(stackTrace);

		return modelAndView;
	}

}
