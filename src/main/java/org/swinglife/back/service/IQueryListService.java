package org.swinglife.back.service;

import java.util.List;

import org.swinglife.common.databean.Message;

public interface IQueryListService {
	List<Message> getMessageList(String command,String description);
}
