package com.wei.create.factory.method;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/8/26 0026.
 */
public class Student  implements FactoryMethod{
    @Override
    public void doSomethings() {
        System.out.println("student doing Somethings");
    }
}
