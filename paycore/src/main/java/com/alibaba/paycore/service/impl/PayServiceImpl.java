package com.alibaba.paycore.service.impl;

import com.alibaba.paycore.dao.PayDao;
import com.alibaba.paycore.model.PayModel;
import com.alibaba.paycore.service.PayService;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author wangte
 * Create At 2022/12/9
 */
@DubboService
public class PayServiceImpl implements PayService {

    @Resource
    private PayDao payDao;

    @Override
    public void pay(String payNo) {
        payDao.createPay(new PayModel(null, payNo));
    }

    @Override
    public void prepare(String payNo) {
        System.out.println("prepare " + payNo + " commit!");
    }

    @Override
    public void commit(BusinessActionContext context) {
        String payNo = (String) context.getActionContext("payNo");
        payDao.createPay(new PayModel(null, payNo));
        System.out.println("payNo " + payNo + " commit!");
    }

    @Override
    public void rollback(BusinessActionContext context) {
        String payNo = (String) context.getActionContext("payNo");
        System.out.println("payNo " + payNo + " rollback,nothing to do!");
    }
}
