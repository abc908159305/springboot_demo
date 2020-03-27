package com.springboot.springboot_demo.mapper;

import com.springboot.springboot_demo.pojo.Category;
import com.springboot.springboot_demo.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestCategoryMapper {
    @Autowired
    CategoryService categoryService;
    @Autowired
    CategoryMapper categoryMapper;
/*    @Test
    public void testList(){
        List<Category> list = categoryMapper.list();
        for (Category c :
                list) {
            System.out.println(c.getName());
        }
    }
    @Test
    public void testGet(){
        Category category = categoryMapper.get(5);
    }
    @Test
    public void testAdd(){
        Category category = new Category();
        category.setName("张4");
        categoryMapper.add(category);
    }*/
    @Test
    public void testDelete(){
        categoryMapper.delete(5);
    }
/*    @Test
    public void testUpdate(){
        Category category = new Category();
        category.setName("张三");
        category.setId(4);
        categoryMapper.update(category);
    }*/

}
