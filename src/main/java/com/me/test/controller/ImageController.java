package com.me.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.me.test.pojo.Image;
import com.me.test.pojo.ImageVo;
import com.me.test.sevice.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
//@RequestMapping("")指定路径名

@RequestMapping(value = "/api/image")
public class ImageController {
    @Autowired
    private ImageService imageSevice;
//    @GetMapping(value = "queryAllByPage")
//    @ResponseBody
//    public ImageVo queryAllByPage (@RequestParam(value = "current",required = false) Integer current ,
//                            @RequestParam(value = "size",required = false) Integer size) {
//       return imageSevice.queryList(current,  size);
//    }
    @GetMapping(value = "queryAll")
    @ResponseBody
    public List<Image> queryAll() {

        List<Image>  imageList =  imageSevice.list(new QueryWrapper<Image>().orderByDesc("upload_time"));
        return imageList;
    }
    @PostMapping(value = "add")
    @ResponseBody
    public String add(Image image){
        imageSevice.save(image);

          return "添加OK";
    }



}
