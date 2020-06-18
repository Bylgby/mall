package com.martinyuyy.mall.order.dao;

import com.martinyuyy.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-17 10:09:38
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
