package com.lsu;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//表示这是一个切面
//必须@Component,不注入的话Spring识别不了切面无效
@Component
@Aspect
public class MyTransation {


    //切入点配置 ，hello为切入点的名字（可任意更改）,value为被切面的目标
    @Pointcut(value = "execution(* com.lsu.service.*.*(..))")
    public void myPointcut(){}


    //开始之前通知
    @Before(value = "myPointcut()")
    public void openTransation(){
        System.out.println("打开事务");
    }

    @AfterReturning(pointcut = "myPointcut()")
    public void closeTransation(){
        System.out.println("关闭事务");
    }

    @AfterThrowing(pointcut = "myPointcut()" ,throwing = "myThrow")
    public  void throwTransation(Throwable myThrow){
        System.out.println("报错："+myThrow.getMessage());
    }

    @After(value = "myPointcut()")
    public  void finalTransation(){
        System.out.println("最终事务");
    }


}
