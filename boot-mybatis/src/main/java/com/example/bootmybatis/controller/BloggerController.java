package com.example.bootmybatis.controller;

import com.example.bootmybatis.entity.Blogger;
import com.example.bootmybatis.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogger")
public class BloggerController {
    @Autowired
    private BloggerService bloggerService;
    @RequestMapping("/getBloggerById")
    private Blogger getBloggerById(){
        Blogger blogger = bloggerService.getBloggerById("1");
        return blogger;
    }
}
