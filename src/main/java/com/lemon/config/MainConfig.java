package com.lemon.config;

import com.lemon.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lemoon on 2023/8/22 08:14
 */
//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，id是默认的方法名作为id
    @Bean("person")
    public Person person01() {
        return new Person("zhangsan", 20);
    }
}
