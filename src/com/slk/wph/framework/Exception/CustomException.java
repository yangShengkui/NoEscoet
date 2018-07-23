package com.slk.wph.framework.Exception;



//自定义异常处理类
public class CustomException extends Exception {
	
	//异常信息
	public String customMessage;
	
	

	public CustomException(String customMessage) {
		super(customMessage);
		this.customMessage = customMessage;
	}

	
	
	public CustomException() {
		super();
	}



	public String getCustomMessage() {
		return customMessage;
	}



	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
	

}
