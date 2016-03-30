package org.swinglife.common.util;


import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class Test2Interception implements WebRequestInterceptor {


	@Override
	public void afterCompletion(WebRequest arg0, Exception arg1)
			throws Exception {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void postHandle(WebRequest arg0, ModelMap arg1) throws Exception {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void preHandle(WebRequest arg0) throws Exception {
		// TODO 自动生成的方法存根
		
	}

}
