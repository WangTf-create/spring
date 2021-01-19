package com.crgs.springcloud.service;

import com.crgs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 14:13
 */
public interface PaymentService {
    /**
     * 插入
     *
     * @param payment 对象
     * @return 影响的行数
     */
    int addPayment(Payment payment);

    /**
     * 查询Payment对象
     *
     * @param id id
     * @return payment
     */
    Payment getPaymentById( Long id);
}
