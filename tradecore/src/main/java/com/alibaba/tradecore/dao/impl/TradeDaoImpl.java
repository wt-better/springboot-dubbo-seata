package com.alibaba.tradecore.dao.impl;

import com.alibaba.tradecore.dao.TradeDao;
import com.alibaba.tradecore.model.TradeModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wangte
 * Create At 2022/12/8
 */
@Component
public class TradeDaoImpl implements TradeDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int createTrade(TradeModel tradeModel) {
        throw new RuntimeException();
//        final String sql = buildInsertTradeSql(tradeModel);
//
//        return jdbcTemplate.update(sql);
    }

    private String buildInsertTradeSql(TradeModel tradeModel) {
        return String.format("INSERT INTO trade_tbl(trade_no) values('%s');", tradeModel.getTradeNo());
    }
}
