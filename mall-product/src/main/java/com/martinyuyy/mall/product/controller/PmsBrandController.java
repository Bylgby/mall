package com.martinyuyy.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martinyuyy.mall.product.entity.BrandEntity;
import com.martinyuyy.mall.product.service.PmsBrandService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.R;



/**
 * 品牌
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 19:02:53
 */
@RestController
@RequestMapping("product/pmsbrand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity pmsBrand = pmsBrandService.getById(brandId);

        return R.ok().put("pmsBrand", pmsBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BrandEntity pmsBrand){
		pmsBrandService.save(pmsBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity pmsBrand){
		pmsBrandService.updateById(pmsBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		pmsBrandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
