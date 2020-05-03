package com.wei.designphilosophy.one;

/**
*@describe  DiscountJavaCourse
*@author  wei.peng
*@date  2020 05/03
*/
public class DiscountJavaCourse extends JavaCourse{
    @Override
    public double getPrice() {
        return super.getPrice() * 0.6;
    }
}
