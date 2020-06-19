package com.martinyuyy.mall.product.dao;

import com.martinyuyy.mall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
@Mapper
public interface PmsSpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
