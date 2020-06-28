package com.hpr.zeromall.member.feign;

import com.hpr.zeromall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: hpr
 * @Date: 2020/6/11 15:01
 */

@FeignClient("zeromall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/test/list")
    public R test();
}
