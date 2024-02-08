package com.lemon.main;

import com.lemon.bean.Person;
import com.lemon.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lemoon on 2024/2/8 14:43
 */
public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) classPathXmlApplicationContext.getBean("person");
//        System.out.println(person);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }
}
