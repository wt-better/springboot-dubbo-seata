package com.alibaba.tradecore;

import io.seata.spring.boot.autoconfigure.SeataDataSourceAutoConfiguration;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangte
 * Create At 2022/12/8
 */
@SpringBootApplication(exclude = SeataDataSourceAutoConfiguration.class)
@EnableDubbo
public class TradecoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradecoreApplication.class, args);
    }
}
