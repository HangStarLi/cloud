package com.lihang.springcloud.service.impl;
import com.lihang.springcloud.dao.PaymentDao;
import com.lihang.springcloud.entities.Payment;
import com.lihang.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * Created by IntelliJ IDEA.
 *
 * @author: LI
 * Date: 2020/11/30
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);

    }
}