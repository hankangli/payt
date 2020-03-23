package com.grpc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName GrpcServiceApplication
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/14 16:01
 * @Version 1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class GrpcWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcWebApplication.class, args);
    }
}
