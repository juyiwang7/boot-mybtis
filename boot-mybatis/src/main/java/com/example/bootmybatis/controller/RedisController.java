package com.example.bootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/test")
    private void test(){
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        operations.set("hello", "77777");
        Object result = operations.get("hello");
        System.out.println(result.toString());

    }
}
