package com.martinyuyy.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.Query;

import com.martinyuyy.mall.coupon.dao.SmsHomeSubjectDao;
import com.martinyuyy.mall.coupon.entity.SmsHomeSubjectEntity;
import com.martinyuyy.mall.coupon.service.SmsHomeSubjectService;


@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl extends ServiceImpl<SmsHomeSubjectDao, SmsHomeSubjectEntity> implements SmsHomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeSubjectEntity> page = this.page(
                new Query<SmsHomeSubjectEntity>().getPage(params),
                new QueryWrapper<SmsHomeSubjectEntity>()
        );

        return new PageUtils(page);
    }

}