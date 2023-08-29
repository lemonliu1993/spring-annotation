package com.lemon.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by lemoon on 2023/8/29 07:40
 * 后置处理器：初始化前后进行处理工作
 * 将后置处理器加入到容器中
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..."+ beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..."+ beanName);
        return bean;
    }
}
