package com.wei.controller.user;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        String[] a  = new String[]{"9","1","2","3","8","4","7","5","6"};
        String[] b = a;
        String[] c = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
        }
        b[0] = "9";
        System.out.println("-------------------");
        for (int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("----------------------");
        for (int i = 0; i < c.length; i++) {
            Arrays.sort(c);
            System.out.println(c[i]);
        }
        TestMain main = new TestMain();
        String re  = "wwww";
        main.getSend(re);
    }

    public void getSend(String... va1){
        System.out.println("String... va1");
    }
    public void getSend(String va1){
        System.out.println("getSend(String va1)");
    }
    /*public void getSend(){
        System.out.println("getSend()");
    }*/
}
