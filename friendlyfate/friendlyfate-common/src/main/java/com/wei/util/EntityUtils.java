package com.wei.util;

import com.wei.annotation.FieldProperty;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.lang.reflect.Field;

public class EntityUtils {
    @FieldProperty(classType = String.class, alias = "ceshi")
    private String name;
    @FieldProperty(classType = User.class, alias = "user")
    private User user;
    public static String jsonConvert(Class target, String json) throws IllegalAccessException, InstantiationException, JSONException {
            if(StringCommonUtils.isEmpty(json)){
                return null;
            }
        JSONObject object = new JSONObject(json);
        Object instance = target.newInstance();
        Field[] fields = target.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            FieldProperty annotation = field.getAnnotation(FieldProperty.class);
            Class type = annotation.classType();

        }
        return null;
    }

    public static void main(String[] args) {

    }
    public static class User{

        private String userName;

        private String  age;

    }


}
