package com.martinyuyy.mall.product.dao;

import com.martinyuyy.mall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
@Mapper
public interface PmsCategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
