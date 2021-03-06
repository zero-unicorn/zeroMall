package com.hpr.zeromall.ware.dao;

import com.hpr.zeromall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:19:51
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
