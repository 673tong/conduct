package com.qianyan.service;

import com.qianyan.entity.Message;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class MenuServiceTest {


    @Autowired
    private  MessageService messageService;
	



   // @Ignore
    @Test
    @Transactional
    @Rollback(false)
    public void saveTestMessage(){
        Message message = new Message();
        message.setIp("192.168.1.105");
        message.setEmail("307970779@qq.com");
        message.setMessage("hello");
       // message.setC_time((new Date()).toString());
        this.messageService.save(message);
    }

    @Test
    @Ignore
    public void getListTop(){
        List<Message> lists =this.messageService.getListTop(10);
        for(Message message:lists){
            System.out.println(message.getIp()+":"+message.getMessage()+":"+message.getC_time());
        }
    }
}
