package com.martinyuyy.mall.coupon.dao;

import com.martinyuyy.mall.coupon.entity.SmsCouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 17:32:32
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
