package com.hpr.zeromall.coupon.dao;

import com.hpr.zeromall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:14:07
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
