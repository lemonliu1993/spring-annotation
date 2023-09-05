package com.lemon.bean;

/**
 * Created by lemoon on 2023/8/25 22:04
 */

public class Color {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }

}
