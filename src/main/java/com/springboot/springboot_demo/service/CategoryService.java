package com.springboot.springboot_demo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.springboot_demo.mapper.CategoryMapper;
import com.springboot.springboot_demo.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "category")
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Cacheable(key = "'category '+#start + '-' + #size ")
    public PageInfo<Category> list(int start, int size) {
        PageHelper.startPage(start, size, "id asc");
        List<Category> list = categoryMapper.list();
        PageInfo<Category> page = new PageInfo<>(list, 5);//导航分页最多有5个
        return page;
    }

    @Cacheable(key = "'category' + #id")
    public Category get(int id) {
        return categoryMapper.get(id);
    }

    @CacheEvict(allEntries = true)
    public void add(Category category) {
        categoryMapper.add(category);
    }

    @CacheEvict(allEntries = true)
    public void delete(int id) {
        categoryMapper.delete(id);
    }

    @CacheEvict(allEntries = true)
    public void update(Category category) {
        categoryMapper.update(category);
    }
}
