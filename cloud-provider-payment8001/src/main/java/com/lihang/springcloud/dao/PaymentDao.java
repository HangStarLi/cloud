package com.lihang.springcloud.dao;

import com.lihang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/11/30
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment); //写

    public Payment getPaymentById(Long id);
}
