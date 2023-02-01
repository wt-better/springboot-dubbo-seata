package com.alibaba.tradecore;

import com.alibaba.tradecore.service.TradeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangte
 * Create At 2022/12/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeServiceTest {

    @Autowired
    private TradeService tradeService;

    @Test
    public void testCreateTrade() {
        tradeService.tradeTcc(String.valueOf(System.currentTimeMillis()));
    }
}
