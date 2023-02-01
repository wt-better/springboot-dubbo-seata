package com.alibaba.paycore;

import com.alibaba.paycore.dao.PayDao;
import com.alibaba.paycore.model.PayModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayDaoTest {

    @Autowired
    private PayDao payDao;

    @Test
    public void testCreateTrade() {
        PayModel payModel = new PayModel();
        payModel.setPayNo("payNo2022121220");
        payDao.createPay(payModel);
    }

}