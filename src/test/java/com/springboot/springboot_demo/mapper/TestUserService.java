package com.springboot.springboot_demo.mapper;

import com.springboot.springboot_demo.pojo.User;
import com.springboot.springboot_demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestUserService {
    @Autowired
    UserService userService;
    @Test
    public void testAdd(){
        User user = new User();
        user.setName("aaa");
        userService.add(user);
    }
    @Test
    public void testDelete(){
        userService.delete(1);
    }
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setName("aaa");
        user.setPassword("aaa");
        userService.update(user);
    }
    @Test
    public void testGet(){
        User user = userService.get(1);
        System.out.println(user.getName());
    }
}
