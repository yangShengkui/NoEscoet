package com.slk.wph.framework.Interceptor.AccessIntercept;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.message.XMLMessage;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;


public class LicenseInterceptor extends  AbstractPhaseInterceptor<Message>{

	public LicenseInterceptor() {
		super(Phase.RECEIVE);
	}

	@Override
	public void handleMessage(Message arg0) throws Fault {

//		System.out.println(arg0.get("org.apache.cxf.request.url"));

		try {
			if(!priv.license.DecodeLicense.Decode()) {
				 throw new Fault(new IllegalAccessException("No permissions"));  
			}
		} catch (Exception e) {
			 throw new Fault(new IllegalAccessException("No permissions")); 
		}		
	}




}
