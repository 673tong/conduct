package com.qianyan.service.impl;

import com.qianyan.dao.MenuMapper;
import com.qianyan.entity.Menu;
import com.qianyan.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
	private MenuMapper menuMapper;
	
	@Transactional
	public void save(Menu menu) {

		this.menuMapper.insert(menu);
	}

    public List<Menu> getAll(){
        return (List<Menu>)this.menuMapper.getAll();
    }
}

