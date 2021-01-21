package com.crgs.springcloud.service.impl;

import com.crgs.springcloud.dao.PaymentDao;
import com.crgs.springcloud.entities.Payment;
import com.crgs.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 14:13
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
