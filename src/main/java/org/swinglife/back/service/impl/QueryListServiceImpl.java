package org.swinglife.back.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.swinglife.back.service.IQueryListService;
import org.swinglife.common.databean.Message;
import org.swinglife.common.entity.MessageExample;
import org.swinglife.common.entity.dao.MessageDAO;

@Service 
public class QueryListServiceImpl implements IQueryListService {
	
	@Resource     
	private MessageDAO messageDAO;
	
	public List<Message> getMessageList(String command,String description){
		MessageExample me = new MessageExample();
		me.createCriteria().andCommandEqualTo(command).andDescriptionEqualTo(description);
		return messageDAO.selectByExample(me);
		
	}

}
