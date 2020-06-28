package com.hpr.zeromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-09 15:40:54
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

