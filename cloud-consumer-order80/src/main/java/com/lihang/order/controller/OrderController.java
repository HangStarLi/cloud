package com.lihang.order.controller;

import com.lihang.springcloud.entities.CommonResult;
import com.lihang.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/12/1
 */
@RestController
@Slf4j
public class OrderController {
    private static final String payMent_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        log.info(payment.toString());
        return restTemplate.postForObject(payMent_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable Long id){
        return restTemplate.getForObject(payMent_URL+"/payment/get/"+id,CommonResult.class);
    }
}
