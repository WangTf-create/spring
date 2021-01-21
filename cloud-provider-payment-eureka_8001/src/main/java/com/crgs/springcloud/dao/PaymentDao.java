package com.crgs.springcloud.dao;

import com.crgs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 14:12
 */
@Mapper
public interface PaymentDao {

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
    Payment getPaymentById(@Param("id") Long id);

}
