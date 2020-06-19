package com.martinyuyy.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martinyuyy.mall.product.entity.AttrAttrgroupRelationEntity;
import com.martinyuyy.mall.product.service.PmsAttrAttrgroupRelationService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.R;



/**
 * 属性&属性分组关联
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
@RestController
@RequestMapping("product/pmsattrattrgrouprelation")
public class PmsAttrAttrgroupRelationController {
    @Autowired
    private PmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsAttrAttrgroupRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AttrAttrgroupRelationEntity pmsAttrAttrgroupRelation = pmsAttrAttrgroupRelationService.getById(id);

        return R.ok().put("pmsAttrAttrgroupRelation", pmsAttrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrAttrgroupRelationEntity pmsAttrAttrgroupRelation){
		pmsAttrAttrgroupRelationService.save(pmsAttrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrAttrgroupRelationEntity pmsAttrAttrgroupRelation){
		pmsAttrAttrgroupRelationService.updateById(pmsAttrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsAttrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
