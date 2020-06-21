package com.martinyuyy.mall.order;

import com.martinyuyy.mall.order.entity.OrderItemEntity;
import com.martinyuyy.mall.order.service.OrderItemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MallOrderApplicationTests {

    @Autowired
    private OrderItemService orderItemService;

    @Test
    void contextLoads() {
        OrderItemEntity orderItem = new OrderItemEntity();
        orderItem.setSkuPrice(new BigDecimal(0.2222));

        System.out.println(orderItemService.save(orderItem));
        OrderItemEntity newOrder = orderItemService.getById(1);
        System.out.println(newOrder);
    }

}
