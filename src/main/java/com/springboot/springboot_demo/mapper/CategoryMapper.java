package com.springboot.springboot_demo.mapper;

import com.springboot.springboot_demo.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CategoryMapper {
    List<Category> list();
    void delete(int id);
    Category get(int id);
    void add(Category category);
    void update(Category category);
}
