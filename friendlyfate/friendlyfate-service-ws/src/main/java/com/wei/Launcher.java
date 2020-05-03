package com.wei;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class Launcher {
    private static final Logger log = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext run = SpringApplication.run(Launcher.class, args);
        Environment env = run.getEnvironment();
        log.info("\n---------------------------------------------------------------------\t\n"
                +"application is {}\t\t\n"
                +"local:\t\t http://localhost:{}\t\t\n"
                +"external：\thttp://{}:{}\t\t\n"
                +"-----------------------------------------------------------------------\t\n",
                env.getProperty("spring.application.name"),env.getProperty("server.port"), InetAddress.getLocalHost().getHostAddress(),env.getProperty("server.port"));
    }

}
