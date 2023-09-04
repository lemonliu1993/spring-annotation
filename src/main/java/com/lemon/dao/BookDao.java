package com.lemon.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by lemoon on 2023/9/4 23:02
 */
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }


}
