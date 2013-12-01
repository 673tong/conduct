package com.qianyan.dao;

import com.qianyan.entity.Message;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-27
 * Time: 下午8:41
 * To change this template use File | Settings | File Templates.
 */
public interface MessageMapper {
    public void insert(Message message);
    public List<Message> getListTop(int number);

}
