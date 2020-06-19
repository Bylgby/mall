package com.martinyuyy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:54
 */
public interface PmsAttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

