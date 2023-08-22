package com.lemon.config;

import com.lemon.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by lemoon on 2023/8/22 08:14
 */
//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
@ComponentScan(value = "com.lemon", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
},useDefaultFilters = false)
//@ComponentScan(value = "com.lemon", excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
//})

//ComponentScan value:指定要扫的包
//excludeFilters = Filter[],指定扫描的时候按照什么规则排除哪些组件
//includeFilters = Filter[],指定扫描的时候只需要包含哪些组件,需要和useDefaultFilters一起使用，因为默认是true

public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，id是默认的方法名作为id
    @Bean("person")
    public Person person01() {
        return new Person("zhangsan", 20);
    }
}
