package com.example.bootmybatis.mapper;

import com.example.bootmybatis.entity.Blogger;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BloggerMapper {
    Blogger getBloggerById(String id);
}
