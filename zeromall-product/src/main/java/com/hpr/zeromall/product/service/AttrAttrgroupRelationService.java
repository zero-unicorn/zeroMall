package com.hpr.zeromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-09 15:40:54
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

