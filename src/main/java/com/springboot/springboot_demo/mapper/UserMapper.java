package com.springboot.springboot_demo.mapper;

import com.springboot.springboot_demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void add(User user);
    void delete(int id);
    User get(int id);
    void update(User user);
}
