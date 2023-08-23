package com.lemon.config;

import com.lemon.bean.Person;
import org.springframework.context.annotation.*;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * Created by lemoon on 2023/8/22 08:14
 */
//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
public class MainConfig2 {

    //默认是单例的

    /**
     * SCOPE_PROTOTYPE :多实例的,ioc容器启动并不会去调用方法创建对象放在容器中
     * 每次获取的时候才会调用方法创建对象
     * SCOPE_SINGLETON :单实例的(默认值),ioc容器启动会调用方法创建对象放到ioc容器中。
     * 以后每次获取就是直接从容器(map.get())中获取
     * SCOPE_REQUEST :同一次请求创建一个实例
     * SCOPE_SESSION :同一个session创建一个实例
     *
     * 懒加载：
     *      单例bean：默认在容器启动的时候创建对象
     *      懒加载：容器启动不创建对象，第一次使用(获取)bean创建对象，并初始化
     *
     * @return
     */
//    @Scope(value = SCOPE_PROTOTYPE)
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("person 初始化");
        return new Person("lisi", 18);
    }
}
