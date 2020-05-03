package com.wei.create.singleton;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/8/23 0023.
 */
public class Singleton {

    private static  Singleton singletonA;
    private static  Singleton singletonB = new Singleton();
    private static  Singleton singletonD;

    public static class SingletonClass{
        private static  Singleton singletonC = new Singleton();
    }

    public static Singleton getSingletonA(){
        if(singletonA == null){
            singletonA = new Singleton();
        }
        return singletonA;
    }


    public static Singleton getSingletonB(){
        return singletonB;
    }


    public static Singleton getSingletonC(){
        return SingletonClass.singletonC;
    }

    public static Singleton getSingletonD(){
        synchronized (Singleton.class){
            if (singletonD == null){
                singletonD = new Singleton();
            }
        }
        return singletonD;
    }

}
