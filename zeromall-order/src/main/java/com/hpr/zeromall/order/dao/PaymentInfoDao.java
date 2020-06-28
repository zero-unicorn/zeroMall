package com.hpr.zeromall.order.dao;

import com.hpr.zeromall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-10 18:28:15
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
