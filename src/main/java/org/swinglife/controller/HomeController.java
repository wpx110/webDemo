package org.swinglife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("home");
		//String str ="test";
		//return new ModelAndView("message","str",str);
		return mav;
				
	}

}
