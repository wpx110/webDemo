package org.swinglife.back.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.swinglife.back.service.IQueryListService;
import org.swinglife.common.databean.Message;

@Controller
public class QueryListAction {
	
	@Resource
	private IQueryListService queryService;
	
	@RequestMapping(value="List" ,method=RequestMethod.POST)
	public ModelAndView queryList(String command,String description) throws SQLException{
		ModelAndView mv = new ModelAndView();
		/*Message mg = new Message();
		mg.setId("100");
		mg.setCommand("你好");
		mg.setContent("我是第一个");
			
		List<Message>  mgs= new ArrayList<Message>();
		mgs.add(mg);*/
		List<Message>  mgs= new ArrayList<Message>();
		mgs = queryService.getMessageList(command, description);
		mv.addObject("messageList", mgs);
		//回显
		mv.addObject("command", command);
		mv.addObject("description", description);
		mv.setViewName("/back/list");
		System.out.println("进入了action 传参：" + command + description);
		
		return mv;
	}
}
