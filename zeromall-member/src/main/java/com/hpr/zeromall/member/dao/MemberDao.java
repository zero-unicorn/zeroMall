package com.hpr.zeromall.member.dao;

import com.hpr.zeromall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:17:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
