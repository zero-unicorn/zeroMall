package com.hpr.zeromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-09 15:40:55
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

