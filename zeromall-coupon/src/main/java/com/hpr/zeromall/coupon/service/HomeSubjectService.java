package com.hpr.zeromall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:14:07
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

