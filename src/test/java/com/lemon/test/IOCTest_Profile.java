package com.lemon.test;

import com.lemon.bean.Boss;
import com.lemon.bean.Car;
import com.lemon.bean.Color;
import com.lemon.config.MainConfigOfProfile;
import com.lemon.config.MainConifgOfAutowired;
import com.lemon.dao.BookDao;
import com.lemon.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created by lemoon on 2023/9/4 23:04
 */
public class IOCTest_Profile {

    //1、使用命令行动态参数:在虚拟机参数位置加载 -Dspring.profiles.active=test
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //1.创建一个applicationContext
        //2.创建需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3.注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4.启动刷新容器
        applicationContext.refresh();

        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }

    @Test
    public void test01_bak() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
