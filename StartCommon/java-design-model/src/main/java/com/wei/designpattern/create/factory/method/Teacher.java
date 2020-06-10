package com.wei.designpattern.create.factory.method;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/8/26 0026.
 */
public class Teacher implements FactoryMethod {
    @Override
    public void doSomethings() {
        System.out.println("teacher doing Somethings");
    }
}
