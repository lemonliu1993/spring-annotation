package com.lemon;

import com.lemon.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lemoon on 2023/8/22 07:39
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
