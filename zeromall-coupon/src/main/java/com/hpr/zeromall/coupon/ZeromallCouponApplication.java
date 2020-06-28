package com.hpr.zeromall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZeromallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeromallCouponApplication.class, args);
    }

}
