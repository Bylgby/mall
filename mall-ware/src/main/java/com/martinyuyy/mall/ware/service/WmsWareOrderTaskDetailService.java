package com.martinyuyy.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.mall.ware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:09:29
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

