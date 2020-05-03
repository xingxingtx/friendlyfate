package com.wei.util;

public class RegexUtils {

    /**验证中文*/
    public  final static  String CHINESE = "[\u4e00-\u9fa5]";

    /**验证邮箱*/
    public  final static  String EMAIL
            = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
}
