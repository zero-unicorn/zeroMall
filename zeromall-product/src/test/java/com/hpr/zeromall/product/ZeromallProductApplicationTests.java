package com.hpr.zeromall.product;

import com.hpr.zeromall.product.entity.BrandEntity;
import com.hpr.zeromall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZeromallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setBrandId(1l);
        entity.setDescript("玩家国度");
        entity.setName("ROG");
        brandService.updateById(entity);
    }

}
