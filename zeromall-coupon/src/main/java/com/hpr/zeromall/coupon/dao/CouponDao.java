package com.hpr.zeromall.coupon.dao;

import com.hpr.zeromall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:14:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
