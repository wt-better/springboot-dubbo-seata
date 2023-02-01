package com.alibaba.tradecore.service.impl;

import com.alibaba.paycore.service.PayService;
import com.alibaba.tradecore.dao.TradeDao;
import com.alibaba.tradecore.model.TradeModel;
import com.alibaba.tradecore.service.TradeService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author wangte
 * Create At 2022/12/9
 */
@Service
public class TradeServiceImpl implements TradeService {

    @DubboReference
    private PayService payService;

    @Resource
    private TradeDao tradeDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void trade(String orderNo) {
        payService.pay("payNo" + orderNo);

        tradeDao.createTrade(new TradeModel(null, "tradeNo" + orderNo));
    }

    @Override
    @GlobalTransactional(name = "tradeTcc", rollbackFor = Exception.class)
    public void tradeTcc(String orderNo) {
        payService.prepare("payNo" + orderNo);
        tradeDao.createTrade(new TradeModel(null, "tradeNo" + orderNo));
    }
}
