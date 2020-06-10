package com.wei.designmode.create.factory.method;



import com.wei.designmode.create.factory.AbstractFactory;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/8/26 0026.
 */
public class TeacherFactory  extends AbstractFactory<FactoryMethod> {

    @Override
    protected FactoryMethod createInstance() {
        return new Teacher();
    }
}
