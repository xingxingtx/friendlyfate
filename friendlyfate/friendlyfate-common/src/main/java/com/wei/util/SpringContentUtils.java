package com.wei.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContentUtils  implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContentUtils.applicationContext = applicationContext;
    }

    public static  ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static  Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }

    public static boolean isSingerInstance(String beanName){
        return applicationContext.isSingleton(beanName);
    }
}
