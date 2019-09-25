package com.example.bootmybatis.serviceImpl;

import com.example.bootmybatis.entity.Blog;
import com.example.bootmybatis.mapper.BlogMapper;
import com.example.bootmybatis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> findAll() {
        return blogMapper.findAll();
    }

    @Override
    public List<Blog> findById(int id) {
        return null;
    }

    @Override
    public void create(Blog blog) {

    }

    @Override
    public void delete(int[] ids) {

    }

    @Override
    public void update(Blog blog) {

    }

    @Override
    public Blog getBlogById(String id) {
        return blogMapper.getBlogById(id);
    }
}
