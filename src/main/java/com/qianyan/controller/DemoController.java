package com.qianyan.controller;

import com.qianyan.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qianyan.service.MenuService;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DemoController {
	
	@Autowired
	private MenuService menuService;
	/*
	@RequestMapping(value="list")
	public String list(){
		this.menuService.save();
		return "list";
	} */

    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<Menu> list = this.menuService.getAll();
        model.addAttribute("list", list);
        return "list";
    }
}
