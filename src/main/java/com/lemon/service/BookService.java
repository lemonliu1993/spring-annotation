package com.lemon.service;

import com.lemon.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by lemoon on 2023/8/22 22:26
 */
@Service
public class BookService {

//    @Qualifier("bookDao")
//    @Autowired
//    @Autowired(required = false)
//    @Resource(name="bookDao2")
    @Inject
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }
}
