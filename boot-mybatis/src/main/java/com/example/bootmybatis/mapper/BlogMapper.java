package com.example.bootmybatis.mapper;

import com.example.bootmybatis.entity.Blog;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface BlogMapper {
    @Select("select * from t_blog")
    List<Blog>findAll();

    Blog getBlogById(String id);
}
