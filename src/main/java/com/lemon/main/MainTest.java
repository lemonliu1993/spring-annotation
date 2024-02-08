package com.lemon.main;

import com.lemon.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lemoon on 2024/2/8 14:43
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
    }
}
