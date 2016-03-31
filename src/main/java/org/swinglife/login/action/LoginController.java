package org.swinglife.login.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user.do")
public class LoginController {
	
	
	@RequestMapping(params="method=toLoginPage" , method = RequestMethod.GET)
	public String toLoginPage(HttpServletRequest request){
		System.out.println("进入登陆页面！");
		return "user/login";
				
	}
	
	@RequestMapping(params="method=toWelcomePage" , method = RequestMethod.GET)
	public String toWelcomePage(HttpServletRequest request,Model model){
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("进入toWelcomePage页面了！");
		return "";
	}

}
