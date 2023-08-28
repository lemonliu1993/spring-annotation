package com.lemon.test;

import com.lemon.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lemoon on 2023/8/26 10:36
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");

        applicationContext.getBean("car");

        //关闭容器
        applicationContext.close();
    }

}
