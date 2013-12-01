package com.qianyan.service.impl;


import com.qianyan.dao.MessageMapper;
import com.qianyan.entity.Message;
import com.qianyan.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
	private MessageMapper messageMapper;
	
	@Transactional
	public void save(Message message) {

		this.messageMapper.insert(message);
	}

    public List<Message> getListTop(int top){
        return (List<Message>)this.messageMapper.getListTop(top);
    }
}

