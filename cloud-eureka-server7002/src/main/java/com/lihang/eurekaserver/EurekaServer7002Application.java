package com.lihang.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/12/28
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002Application {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7002Application.class,args);
    }
}
