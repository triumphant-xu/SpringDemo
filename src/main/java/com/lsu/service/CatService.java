package com.lsu.service;


import com.lsu.dao.CatDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CatService {

    @Resource
    CatDao catDao;

    public  void findCat(){
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        catDao=(CatDao)context.getBean("catDao");
        catDao.findCat();
    }

}
