package com.luojianhua.sleep_monitoring.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

/**
 * MBP分页配置类
 */
public class MBPConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){

        return new PaginationInterceptor();
    }
}
