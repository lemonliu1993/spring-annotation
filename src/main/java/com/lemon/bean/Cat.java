package com.lemon.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by lemoon on 2023/8/28 22:50
 */
@Component
public class Cat implements InitializingBean, DisposableBean{

    public Cat(){
        System.out.println("cat constructor...");
    }

    public void destroy() throws Exception {
        System.out.println("cat destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet...");
    }
}
