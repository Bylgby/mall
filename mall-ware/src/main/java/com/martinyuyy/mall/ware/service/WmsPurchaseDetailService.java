package com.martinyuyy.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.mall.ware.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:09:29
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

