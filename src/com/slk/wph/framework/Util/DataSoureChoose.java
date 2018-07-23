package com.slk.wph.framework.Util;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.slk.wph.framework.Exception.CustomException;

public class DataSoureChoose {
	
	
	
	
	public static Boolean changeDataSoure(HttpSession session,HttpServletRequest request,Boolean type){
		String dba_ID="0";
		if(type==true){
			dba_ID=getDataSoure(session, request);
			if(null==dba_ID||"0".equals(dba_ID)||"".equals(dba_ID)){
				DBContextHolder.setDBType("0");
				return false;
			}
		}
		
		DBContextHolder.setDBType(dba_ID);
	
		return true;
	}
	
	
	public static void setDataSoure(String id,HttpSession session,HttpServletResponse response){


	
		
		DBContextHolder.clearDBType();
		DBContextHolder.setDBType(id);
		session.removeAttribute("user_DBA_ID");
		
		session.setAttribute("user_DBA_ID", String.valueOf(id));
		
		deleteCookie(response,"user_DBA_ID");
		
		addCookie(response,"user_DBA_ID",String.valueOf(id));
	}
	
	
	public static String getDataSoure(HttpSession session,HttpServletRequest request) {
		
		String userName=null;
		String dba_ID="0";
		
		userName=(String)session.getAttribute("userName");
		if(null==userName||"".equals(userName)){
			userName=getCookieByName(request,"userName");
			if(null==userName||"".equals(userName))
				try {
					throw new CustomException("当前用户未登陆");
				} catch (CustomException e) {
					e.printStackTrace();
				}
		}
		
		dba_ID=(String)session.getAttribute("user_DBA_ID");
		
		if(null==dba_ID||"".equals(dba_ID)){
			
			dba_ID=getCookieByName(request,"user_DBA_ID");
			if(null==dba_ID||"".equals(dba_ID)){
				dba_ID="0";
			}
				
		}
		
		return dba_ID;
	}
	
	
	public static void SaveDataSoure(HttpSession session,HttpServletResponse response,String userName,Integer dba_ID){
		DBContextHolder.clearDBType();
		session.removeAttribute("userName");
		session.removeAttribute("user_DBA_ID");
		
		session.setAttribute("userName", userName);
		session.setAttribute("user_DBA_ID", String.valueOf(dba_ID));
		
		deleteCookie(response,"userName");
		deleteCookie(response,"user_DBA_ID");
		
		addCookie(response,"userName",userName);
		addCookie(response,"user_DBA_ID",String.valueOf(dba_ID));
	}
	
	
	public static void clearSessionOrCookie(HttpSession session,HttpServletResponse response){
		session.setAttribute("userName", null);
		session.setAttribute("user_DBA_ID", null);
		session.removeAttribute("userName");
		session.removeAttribute("user_DBA_ID");
		session.invalidate();
		DBContextHolder.clearDBType();
		deleteCookie(response,"userName");
		deleteCookie(response,"user_DBA_ID");
		
	}
	
	
	
	public static  void addCookie(HttpServletResponse response,String name,String value){

	   
	    try {
	    	name=URLEncoder.encode(name,"UTF-8");
	    	
	    	value=URLEncoder.encode(value,"UTF-8");
	    	
	    	
		} catch (Exception e) {
		System.out.println("转码错误");
		
			
		}
	    Cookie cookie = new Cookie(name,value);
	    cookie.setPath("/");

	   cookie.setMaxAge(60*60*24*7*365);

	    response.addCookie(cookie);

	}
	
	public static String getCookieByName(HttpServletRequest request,String name){
		String cookie=null;
		
		Cookie[] cookies = request.getCookies();
        for(Cookie c :cookies ){
        	if(name.trim().equals(c.getName()))
            {
        		cookie=c.getValue();
        	return c.getValue();
        	}
        }

	   return cookie;

	}
	
	
	public static void deleteCookie(HttpServletResponse response,String cookName){
		Cookie cookie = new Cookie(cookName, null);
		cookie.setPath("/");
		cookie.setMaxAge(0);
		response.addCookie(cookie); 
		
	}
	
	
	public static Cookie getCookieByNameByCookie(HttpServletRequest request,String name){
		Cookie cookie=null;
		
		Cookie[] cookies = request.getCookies();
        for(Cookie c :cookies ){
        	if(name.trim().equals(c.getName()))
            {
        	//	System.out.println(c.getName()+"--->"+c.getValue());
        		cookie=c;
        	return c;
        	}
        }
	   return cookie;

	}
	
	
	
	
	

}
