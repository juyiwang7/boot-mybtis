package com.example.bootmybatis.controller;

import com.example.bootmybatis.entity.Blog;
import com.example.bootmybatis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/findAll")
    private List<Blog> findAll(){
        List<Blog> blogList = blogService.findAll();
        return blogList;
    }

    @RequestMapping("findBlogById")
    private Blog findBlogById(){
        Blog blog = blogService.getBlogById("94");
        return blog;
    }
}
