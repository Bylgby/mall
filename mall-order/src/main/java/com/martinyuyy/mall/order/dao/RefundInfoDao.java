package com.martinyuyy.mall.order.dao;

import com.martinyuyy.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-17 10:09:38
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
