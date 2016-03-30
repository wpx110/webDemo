package org.swinglife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {

	@RequestMapping("/test")
	public ModelAndView test(){
		String str ="我是后台java代码过来的";
		return new ModelAndView("message","str",str);
				
	}
}
