package com.springboot.springboot_demo.service;

import com.springboot.springboot_demo.mapper.UserMapper;
import com.springboot.springboot_demo.pojo.Category;
import com.springboot.springboot_demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public void add(User user){
        userMapper.add(user);
    }
    public void delete(int id){
        userMapper.delete(id);
    }
    public void update(User user){
        userMapper.update(user);
    }
    public User get(int id){
        User user = userMapper.get(id);
        return user;
    }
}
