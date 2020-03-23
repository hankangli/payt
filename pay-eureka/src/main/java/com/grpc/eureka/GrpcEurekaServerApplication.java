package com.grpc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName GrpcEurekaServerApplication
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/14 15:56
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class GrpcEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcEurekaServerApplication.class, args);
    }

}
