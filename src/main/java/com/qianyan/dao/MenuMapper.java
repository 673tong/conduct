package com.qianyan.dao;

import com.qianyan.entity.Menu;

import java.util.List;

public interface MenuMapper {
	public void insert(Menu menu);
    public List<Menu> getAll();
}
