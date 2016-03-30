package org.swinglife.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Test1Interception implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("执行到方法afterCompletion1");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("执行到方法postHandle1");
		//可以通过ModelAndView参数来改变现实的视图，或修改发往视图的方法
		//arg3.addObject("这里传回的是被拦截器修改之后的消息！");
		//在拦截器这里页面转向
		//arg3.setViewName("/succ");
		
	}

	
	/*
	 * 返回值：表示我们是否把当前的方法拦截下来
	 * 如果返回false表示请求将被终止
	 * 如果返回true 表示请求继续进行
	 * arg2表示的是被拦截的请求的目标对象
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		//拦截器 处理请求中的字符编码为utf-8
		arg0.setCharacterEncoding("utf-8");
		System.out.println("执行到方法preHandle1");
		//如果没有session，请求终止 则跳转到登录页面
		if(arg0.getSession().getAttribute("user") == null){
			arg0.getRequestDispatcher("/page/user/login.jsp").forward(arg0, arg1);
			return false;
		}
		return true;
	}

}
