package com.alibaba.paycore.dao;

import com.alibaba.paycore.model.PayModel;

/**
 * @author wangte
 * Create At 2022/12/9
 */
public interface PayDao {

    /**
     * Create pay order.
     *
     * @param payModel the pay model
     * @return the int
     */
    int createPay(PayModel payModel);
}
