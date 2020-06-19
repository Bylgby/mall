package com.martinyuyy.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.Query;

import com.martinyuyy.mall.product.dao.PmsBrandDao;
import com.martinyuyy.mall.product.entity.BrandEntity;
import com.martinyuyy.mall.product.service.PmsBrandService;


@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, BrandEntity> implements PmsBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}