package com.springboot.springboot_demo.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.springboot_demo.pojo.Category;
import com.springboot.springboot_demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping(value = "/categories")
    public PageInfo<Category> list(@RequestParam(value = "start",defaultValue = "0") int start,
                               @RequestParam(value = "size",defaultValue = "5") int size){
        PageInfo<Category> page = categoryService.list(start, size);
        return page;
    }
    @DeleteMapping(value = "/categories/{id}")
    public String delete(@PathVariable("id") int id){
        categoryService.delete(id);
        //restful规范中，delete后返回空才表示删除成功
        return null;
    }
    @PostMapping(value = "/categories")
    public Object add(@RequestBody Category category){
        categoryService.add(category);
        return category;
    }
    @PutMapping(value = "/categories")
    public Object update(@RequestBody Category category){
        categoryService.update(category);
        return category;
    }
}
