package com.hpr.zeromall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZeromallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeromallProductApplication.class, args);
    }

}
