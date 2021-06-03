package com.lihang.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/12/28
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaPayment8003Application {
    public static void main(String[] args){
        SpringApplication.run(EurekaPayment8003Application.class,args);
    }
}
