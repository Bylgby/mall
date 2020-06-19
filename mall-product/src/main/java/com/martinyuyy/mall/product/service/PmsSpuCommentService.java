package com.martinyuyy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
public interface PmsSpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

