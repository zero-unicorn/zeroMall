package com.hpr.zeromall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:17:20
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

