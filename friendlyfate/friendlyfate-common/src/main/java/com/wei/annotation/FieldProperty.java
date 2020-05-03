package com.wei.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FieldProperty {

    /**字段值*/
    public String value() default "";

    /**字段别名*/
    public String alias() default "";

    /**字段类型*/
    public Class classType() default String.class;

    /**字段是否是集合 1：单对象，2：多对象集合*/
    public int Type() default 1;
}
