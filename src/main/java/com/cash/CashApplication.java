package com.cash;

import com.cash.common.config.MybatisConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-14 16:31
 **/
@SpringBootApplication(scanBasePackageClasses = {CashApplication.class, MybatisConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.cash.business.mapper"})
public class CashApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashApplication.class, args);
    }

}
