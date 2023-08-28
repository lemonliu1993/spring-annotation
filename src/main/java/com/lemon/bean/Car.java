package com.lemon.bean;

/**
 * Created by lemoon on 2023/8/26 10:26
 */
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void destroy(){
        System.out.println("car ... destroy...");
    }
}
