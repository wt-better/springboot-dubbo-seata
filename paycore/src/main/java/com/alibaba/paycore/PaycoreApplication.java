package com.alibaba.paycore;

import io.seata.spring.boot.autoconfigure.SeataDataSourceAutoConfiguration;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SeataDataSourceAutoConfiguration.class)
@EnableDubbo
public class PaycoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaycoreApplication.class, args);
    }

}
