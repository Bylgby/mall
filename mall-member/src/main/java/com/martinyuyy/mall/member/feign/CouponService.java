package com.martinyuyy.mall.member.feign;

import com.martinyuyy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created date 2020/6/21 10:07
 *
 * @author maxiaowei
 */
@FeignClient("mall-coupon")
public interface CouponService {

    @GetMapping("coupon/smscoupon/member/list")
    public R memberCoupons();
}
