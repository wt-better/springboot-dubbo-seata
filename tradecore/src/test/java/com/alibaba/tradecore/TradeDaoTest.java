package com.alibaba.tradecore;

import com.alibaba.tradecore.dao.TradeDao;
import com.alibaba.tradecore.model.TradeModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeDaoTest {

    @Autowired
    private TradeDao tradeDao;

    @Test
    public void testCreateTrade() {
        TradeModel tradeModel = new TradeModel();
        tradeModel.setTradeNo("tradeNo2022121220");
        tradeDao.createTrade(tradeModel);
    }

}