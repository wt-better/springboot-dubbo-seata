package com.alibaba.tradecore.dao;

import com.alibaba.tradecore.model.TradeModel;

/**
 * @author wangte
 * Create At 2022/12/8
 */
public interface TradeDao {

    /**
     * Create trade order.
     *
     * @param tradeModel the trade model
     * @return the int
     */
    int createTrade(TradeModel tradeModel);
}
