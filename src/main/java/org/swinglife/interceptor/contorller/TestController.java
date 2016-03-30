package org.swinglife.interceptor.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {
	
	@RequestMapping(value="viewAll" ,method=RequestMethod.POST)
	public ModelAndView viewAll(String name, String pwd){
		ModelAndView mv = new ModelAndView();
		System.out.println("进入控制器的viewAll() 方法...");
		System.out.println("name =" + name);
		System.out.println("pwd =" + pwd);
		mv.setViewName("/message");
		return mv;
	}

}
