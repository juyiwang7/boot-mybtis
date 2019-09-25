package com.example.bootmybatis.entity;


import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
public class Blog {
    private String id;
    private String title;
    private String summary;
    private Date releaseDate;
    private int clickHit;
    private int replyHit;
    private String content;
    private String typeId;
    private String KeyWord;
}
