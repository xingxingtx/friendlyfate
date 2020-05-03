package com.wei.config.env;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/8/28 0028.
 */
@Component
public class EnvironmentHelper implements EnvironmentAware{

    private Environment environment;

    private static final String PRO = "pro";
    private static final String DEV = "dev";


    public String[] getActiveProfiles(){
        return environment.getActiveProfiles();
    }

    public String getProperties(String key){
        return environment.getProperty(key);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
