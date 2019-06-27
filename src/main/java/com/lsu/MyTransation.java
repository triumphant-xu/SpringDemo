package com.lsu;

public class MyTransation {

    public void openTransation(){
        System.out.println("打开事务");
    }

    public void closeTransation(){
        System.out.println("关闭事务");
    }
    public  void throwTransation(Throwable xxx){
        System.out.println("报错事务");
    }

    public  void finalTransation(){
        System.out.println("最终事务");
    }


}
