package com.grpc.service.config.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName MybatisConfig
 * @Description 分页插件配置
 * @Author hankangli
 * @Date 2020/3/23 21:49
 * @Version 1.0
 **/
@EnableTransactionManagement
@Configuration
@MapperScan("com.grpc.dao")
public class MybatisConfig {
    /**mybatis-plus 分页插件*/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
