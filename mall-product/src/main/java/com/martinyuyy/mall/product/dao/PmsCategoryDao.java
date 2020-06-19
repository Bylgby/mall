package com.martinyuyy.mall.product.dao;

import com.martinyuyy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<CategoryEntity> {
	
}
