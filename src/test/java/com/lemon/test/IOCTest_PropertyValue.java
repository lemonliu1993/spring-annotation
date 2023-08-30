package com.lemon.test;

import com.lemon.bean.Person;
import com.lemon.config.MainConfigOfLifeCycle;
import com.lemon.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lemoon on 2023/8/26 10:36
 */
public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);


    @Test
    public void test01(){
        printBeans(applicationContext);
        System.out.println("================");

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
    }

}
