package com.martinyuyy.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.mall.member.entity.UmsGrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 17:40:52
 */
public interface UmsGrowthChangeHistoryService extends IService<UmsGrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

