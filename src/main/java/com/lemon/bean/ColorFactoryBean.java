package com.lemon.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by lemoon on 2023/8/25 23:26
 * 创建一个Spring定义的FactoryBean
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    //返回一个Color对象，这个对象会添加到容器中
    public Color getObject() throws Exception {
        return new Color();
    }


    public Class<?> getObjectType() {
        return Color.class;
    }

    //是单例么 true:bean是单实例的，在容器中只会保存一份
    public boolean isSingleton() {
        return true;
    }
}
