package com.alibaba.tradecore.service;

/**
 * @author wangte
 * Create At 2022/12/9
 */
public interface TradeService {

    /**
     * Trade
     *
     * @param orderNo the order no
     */
    void trade(String orderNo);

    /**
     * Trade
     *
     * @param orderNo the order no
     */
    void tradeTcc(String orderNo);
}
