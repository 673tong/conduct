package com.qianyan.service;


import com.qianyan.entity.Message;

import java.util.List;

public interface MessageService {
	public void save(Message message);
    public List<Message> getListTop(int top);
}
