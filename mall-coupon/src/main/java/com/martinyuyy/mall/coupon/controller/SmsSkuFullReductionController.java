package com.martinyuyy.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martinyuyy.mall.coupon.entity.SmsSkuFullReductionEntity;
import com.martinyuyy.mall.coupon.service.SmsSkuFullReductionService;
import com.martinyuyy.common.utils.PageUtils;
import com.martinyuyy.common.utils.R;



/**
 * 商品满减信息
 *
 * @author Martinyuyy
 * @email martinyuyy@gmail.com
 * @date 2020-06-19 17:32:32
 */
@RestController
@RequestMapping("coupon/smsskufullreduction")
public class SmsSkuFullReductionController {
    @Autowired
    private SmsSkuFullReductionService smsSkuFullReductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSkuFullReductionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsSkuFullReductionEntity smsSkuFullReduction = smsSkuFullReductionService.getById(id);

        return R.ok().put("smsSkuFullReduction", smsSkuFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsSkuFullReductionEntity smsSkuFullReduction){
		smsSkuFullReductionService.save(smsSkuFullReduction);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsSkuFullReductionEntity smsSkuFullReduction){
		smsSkuFullReductionService.updateById(smsSkuFullReduction);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsSkuFullReductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
