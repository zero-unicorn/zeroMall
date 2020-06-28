package com.hpr.zeromall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpr.zeromall.common.utils.PageUtils;
import com.hpr.zeromall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hpr
 * @email hepeirui@126.com
 * @date 2020-06-11 10:19:51
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

