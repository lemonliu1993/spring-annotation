package com.lemon.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lemoon on 2023/9/5 07:48
 * 默认加载ioc容器中的组件，容器启动就会调用无参数构造器创建对象，再进行初始化赋值等操作
 */
@Component
public class Boss {

//    @Autowired
    private Car car;

    //构造器要用的组件。都是从容器中获取
    @Autowired
    public Boss(Car car){
        this.car = car;
        System.out.println("Boss...构造器");
    }



    public Car getCar() {
        return car;
    }


//    @Autowired
    //标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值
    //方法使用的参数，自定义类型的值从ioc容器中获取
    public void setCar(Car car) {
        this.car = car;
    }



    @Override
    public String toString() {
        return "Boss [car=" + car + "]";
    }

}
