package com.martinyuyy.mall.product.dao;

import com.martinyuyy.mall.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:54
 */
@Mapper
public interface PmsSkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
