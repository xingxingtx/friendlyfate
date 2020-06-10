package com.wei.util.valid;

/**
*@describe  ValidUtils
*@author  wei.peng
*@date  2020 05/09
*/
public class ValidUtils {

    public static <T> T requireNonNull(T object){
        if(object == null){
            throw new NullPointerException();
        }
        return object;
    }
}
