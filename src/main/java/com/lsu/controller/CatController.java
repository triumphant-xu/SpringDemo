package com.lsu.controller;
import com.lsu.service.CatService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
//@compoment 和@Resource一起使用  ，使用时spring自动将@COMPOMENT注入bean
//即不能手动注入bean


@Component
public class CatController {


    @Resource
    //@Resource(name = "")   按照name匹配bean中的id，无参数的话
            CatService catService;

    public void showCat(){

        //属性名上面的@Resource代表Spring在已经在xml中查找，对应关系 属性名=bean.id  .找到之后将其实例化
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        catService=(CatService) context.getBean("catService");
        catService.findCat();

    }


}
