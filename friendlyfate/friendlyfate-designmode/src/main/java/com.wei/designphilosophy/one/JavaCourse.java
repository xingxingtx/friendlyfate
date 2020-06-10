package com.wei.designphilosophy.one;

/**
*@describe  JavaCourse
*@author  wei.peng
*@date  2020 05/03
*/
public class JavaCourse implements ICourse {

    public int getId() {
        return 1;
    }

    public String getName() {
        return "this is java course";
    }

    public double getPrice() {
        return 100d;
    }
}
