package com.example.bootmybatis.service;

import com.example.bootmybatis.entity.Blog;

import java.util.List;

public interface BlogService extends BaseService<Blog> {
    List<Blog> findAll();

    @Override
    List<Blog> findById(int id);

    @Override
    void create(Blog blog);

    @Override
    void delete(int[] ids);

    @Override
    void update(Blog blog);

    Blog getBlogById(String id);
}
