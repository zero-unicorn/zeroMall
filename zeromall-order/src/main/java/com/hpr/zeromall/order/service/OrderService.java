package com.hpr.zeromall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-10 18:28:15
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

