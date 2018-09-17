package com.cash.config;

import com.cash.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: tms-cloud
 * @description: 异常、拦截器设置
 * @author: xiongzy
 * @create: 2018-08-14 16:40
 **/
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

}
