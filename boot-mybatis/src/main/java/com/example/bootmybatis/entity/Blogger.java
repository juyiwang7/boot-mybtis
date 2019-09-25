package com.example.bootmybatis.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Blogger {
    private String id;
    private String userName;
    private String password;
    private String profile;
    private String nickName;
    private String sign;
    private String imageName;
}
