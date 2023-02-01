package com.alibaba.paycore.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * @author wangte
 * Create At 2022/12/9
 */
public interface PayService {

    /**
     * Pay
     *
     * @param payNo the pay no
     */
    void pay(String payNo);

    @TwoPhaseBusinessAction(name = "payService")
    void prepare(@BusinessActionContextParameter(paramName = "payNo") String payNo);

    void commit(BusinessActionContext context);

    void rollback(BusinessActionContext context);
}
