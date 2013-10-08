package com.qianyan.service;

import com.qianyan.entity.Menu;

import java.util.List;

public interface MenuService {
	public void save(Menu menu);
    public List<Menu> getAll();
}
