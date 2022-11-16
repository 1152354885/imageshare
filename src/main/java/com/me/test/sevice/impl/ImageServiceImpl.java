package com.me.test.sevice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.me.test.mapper.ImageMapper;
import com.me.test.pojo.Image;
import com.me.test.sevice.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper,Image> implements ImageService {
//    @Autowired
//    private  ImageMapper imageMapper;
//    @Override
//    public List<Image> queryAll() {
//        QueryWrapper wrapper = new QueryWrapper();
//       return imageMapper.selectList((Wrapper<Image>) wrapper.orderByDesc("upload_time"));
//    }

//    @Override
//    public ImageVo queryList(Integer current, Integer size) {
//
//            /**
//             * 这些代码应该写在service层
//             */
//
//              QueryWrapper<Image> wrapper = new QueryWrapper();
//              ImageVo imageVo = new ImageVo();
//              IPage<Image> page = new Page<>(current,size);
//              imageMapper.selectPage(page,wrapper.orderByDesc("upload_time"));
//              imageVo.setCurrent(current);
//              imageVo.setTotal(page.getTotal());
//              imageVo.setImageList(page.getRecords());
//              return imageVo;
//        }






}
