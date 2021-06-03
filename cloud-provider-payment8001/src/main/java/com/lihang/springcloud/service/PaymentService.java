package com.lihang.springcloud.service;
import com.lihang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/11/30
 */


public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
