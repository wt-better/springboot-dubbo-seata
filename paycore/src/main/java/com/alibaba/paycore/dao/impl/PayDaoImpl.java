package com.alibaba.paycore.dao.impl;

import com.alibaba.paycore.dao.PayDao;
import com.alibaba.paycore.model.PayModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wangte
 * Create At 2022/12/9
 */
@Component
public class PayDaoImpl implements PayDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int createPay(PayModel payModel) {
        final String sql = buildInsertTradeSql(payModel);

        return jdbcTemplate.update(sql);
    }

    private String buildInsertTradeSql(PayModel payModel) {
        return String.format("INSERT INTO pay_tbl(pay_no) values('%s');", payModel.getPayNo());
    }
}
