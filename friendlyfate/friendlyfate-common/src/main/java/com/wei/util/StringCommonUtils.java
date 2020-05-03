package com.wei.util;

public class StringCommonUtils {

    /**
     * 判断str是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(Object str){
        return (str == null || "".equals(str));
    }

    /**
     * 返回字符长度 中文为2个字符长度
     * @param str
     * @return
     */
    public static int stringLength(String str){
        int length = 0;
        if(isEmpty(str)){
            return length;
        }
        for (int i = 0; i < str.length(); i++) {
         String temp = str.substring(i, i+1);
            if (temp.matches(RegexUtils.CHINESE)){
                length +=2;
            }else {
                length +=1;
            }
        }
        return length;
    }

    /**
     * 校验str字符长度是否在[start, end]范围
     * @param str
     * @param start
     * @param end
     * @return
     */
    public static boolean lengthValidate(String str,int start, int end) {
        int length = stringLength(str);
        if(start <= length && length <= end){
            return true;
        }
        return false;
    }

}
