package com.qianyan.controller;


import com.qianyan.entity.Message;
import com.qianyan.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class DemoController {
	
	@Autowired
	private MessageService messageService;

    /*@Autowired
    private  HttpServletRequest request;*/

    @RequestMapping(value="/list.do",method = RequestMethod.GET)
    public String list(ModelMap model) {
        List<Message> list = this.messageService.getListTop(20);
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(value="/save.do",method = RequestMethod.POST)
    public String save(ModelMap model,@ModelAttribute("form") Message message) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        message.setIp(getIpAddr(request));
        this.messageService.save(message);
        return "redirect:/list.do";
    }

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
