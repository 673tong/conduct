package com.qianyan.service;

import com.qianyan.entity.Menu;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class MenuServiceTest {
	@Autowired
	private MenuService menuService;
	

    @Ignore
	@Transactional
	@Rollback(false)
	public void saveTest(){
        Menu menu =new Menu();
        menu.setName("李振");
		this.menuService.save(menu);
	}

    @Test
    public void getAll(){
        List<Menu> lists =this.menuService.getAll();
        for(Menu menu:lists){
            System.out.println(menu.getId()+""+menu.getName());
        }
    }
}
