package com.hpr.zeromall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:14:06
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

