package com.martinyuyy.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.Query;

import com.martinyuyy.mall.product.dao.PmsProductAttrValueDao;
import com.martinyuyy.mall.product.entity.ProductAttrValueEntity;
import com.martinyuyy.mall.product.service.PmsProductAttrValueService;


@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl extends ServiceImpl<PmsProductAttrValueDao, ProductAttrValueEntity> implements PmsProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttrValueEntity> page = this.page(
                new Query<ProductAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}