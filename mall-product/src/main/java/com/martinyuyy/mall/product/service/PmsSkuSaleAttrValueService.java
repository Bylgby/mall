package com.martinyuyy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:54
 */
public interface PmsSkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

