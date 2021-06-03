package com.lihang.consul.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/12/14
 */
@Configuration
public class MyConfigure {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
