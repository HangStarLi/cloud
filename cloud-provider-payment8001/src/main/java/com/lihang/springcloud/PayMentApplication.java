package com.lihang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMentApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(PayMentApplication.class,args);
    }
}
