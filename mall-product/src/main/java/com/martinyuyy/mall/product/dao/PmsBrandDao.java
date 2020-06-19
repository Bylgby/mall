package com.martinyuyy.mall.product.dao;

import com.martinyuyy.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
@Mapper
public interface PmsBrandDao extends BaseMapper<BrandEntity> {
	
}
