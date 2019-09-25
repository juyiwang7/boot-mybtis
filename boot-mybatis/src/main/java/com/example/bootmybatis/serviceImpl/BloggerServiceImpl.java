package com.example.bootmybatis.serviceImpl;

import com.example.bootmybatis.entity.Blogger;
import com.example.bootmybatis.mapper.BloggerMapper;
import com.example.bootmybatis.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloggerServiceImpl implements BloggerService {
    @Autowired
    private BloggerMapper bloggerMapper;
    @Override
    public List<Blogger> findAll() {
        return null;
    }

    @Override
    public List<Blogger> findById(int id) {
        return null;
    }

    @Override
    public void create(Blogger blogger) {

    }

    @Override
    public void delete(int[] ids) {

    }

    @Override
    public void update(Blogger blogger) {

    }

    @Override
    public Blogger getBloggerById(String id) {
        return bloggerMapper.getBloggerById(id);
    }
}
