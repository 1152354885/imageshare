package com.me.test.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ImageVo
{
    private Integer current;
    private Integer size;
    private Long total;
    private List<Image> imageList;
}
