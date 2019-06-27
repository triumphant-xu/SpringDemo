package com.lsu.dao;

import org.springframework.stereotype.Component;

@Component
public class CatDao {

    public void findCat(){
        System.out.println("dao层提供了相应的数据");
        int i=5/0;
    }
}
