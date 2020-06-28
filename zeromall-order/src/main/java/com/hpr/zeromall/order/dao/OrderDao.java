package com.hpr.zeromall.order.dao;

import com.hpr.zeromall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-10 18:28:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
