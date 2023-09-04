package com.lemon.test;

import com.lemon.bean.Car;
import com.lemon.config.MainConifgOfAutowired;
import com.lemon.dao.BookDao;
import com.lemon.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lemoon on 2023/9/4 23:04
 */
public class IOCTest_Autowired {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        BookDao bean = applicationContext.getBean(BookDao.class);
        System.out.println(bean);

    }
}
