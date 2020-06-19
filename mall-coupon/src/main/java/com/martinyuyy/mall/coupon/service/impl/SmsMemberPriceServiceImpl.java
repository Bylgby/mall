package com.martinyuyy.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.Query;

import com.martinyuyy.mall.coupon.dao.SmsMemberPriceDao;
import com.martinyuyy.mall.coupon.entity.SmsMemberPriceEntity;
import com.martinyuyy.mall.coupon.service.SmsMemberPriceService;


@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceDao, SmsMemberPriceEntity> implements SmsMemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsMemberPriceEntity> page = this.page(
                new Query<SmsMemberPriceEntity>().getPage(params),
                new QueryWrapper<SmsMemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}