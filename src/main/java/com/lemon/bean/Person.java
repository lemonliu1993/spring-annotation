package com.lemon.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by lemoon on 2023/8/22 07:38
 */
public class Person {

    //使用@Value赋值
    //1.基本数值
    //2.可以写SpEL:#{}
    //3.可以写${},取出配置文件【properties】中的值(在运行环境变量里面的值)


    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private int age;

    @Value("${person.nickName}")
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
