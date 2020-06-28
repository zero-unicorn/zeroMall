package com.hpr.zeromall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZeromallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeromallWareApplication.class, args);
    }

}
