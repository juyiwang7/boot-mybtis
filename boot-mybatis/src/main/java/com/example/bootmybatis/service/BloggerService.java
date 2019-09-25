package com.example.bootmybatis.service;

import com.example.bootmybatis.entity.Blogger;

import java.util.List;

public interface BloggerService extends BaseService<Blogger> {
    @Override
    List<Blogger> findAll();

    @Override
    List<Blogger> findById(int id);

    @Override
    void create(Blogger blogger);

    @Override
    void delete(int[] ids);

    @Override
    void update(Blogger blogger);

    Blogger getBloggerById(String id);
}
