package com.lihang.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/12/14
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul: "+port+"\t"+ UUID.randomUUID().toString();
    }
}
