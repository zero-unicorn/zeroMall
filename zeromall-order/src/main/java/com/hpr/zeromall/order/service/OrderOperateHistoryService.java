package com.hpr.zeromall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-10 18:28:15
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

