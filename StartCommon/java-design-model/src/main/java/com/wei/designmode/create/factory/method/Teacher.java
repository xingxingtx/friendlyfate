package com.wei.designmode.create.factory.method;

import com.wei.designmode.create.factory.method.FactoryMethod;

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
