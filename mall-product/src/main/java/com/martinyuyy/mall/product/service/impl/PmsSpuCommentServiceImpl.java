package com.martinyuyy.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.Query;

import com.martinyuyy.mall.product.dao.PmsSpuCommentDao;
import com.martinyuyy.mall.product.entity.SpuCommentEntity;
import com.martinyuyy.mall.product.service.PmsSpuCommentService;


@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl extends ServiceImpl<PmsSpuCommentDao, SpuCommentEntity> implements PmsSpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}