package com.penney.order.controller;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-07 12:42
 **/


import com.penney.order.service.OrderService;
import com.penney.order.service.openfegin.WareHouseOpenFeignService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    public OrderService orderService;
    @Resource
    public WareHouseOpenFeignService wareHouseOpenFeignService ;
    // 1.得到日志对象
    private static Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping("/getOrder")
    public String getOrder() {
// 2.使用日志打印日志
        logger.trace("================= getOrder ===============");
        orderService.getOrder();
//        orderOpenFeignService.getInfo("");
        return "Hi," ;
    }

    @RequestMapping("/getOrderV2")
    public String getOrderV2() {
// 2.使用日志打印日志
        logger.trace("================= getOrderV2 ===============");
        orderService.getOrderV2();
        return "getOrderV2," ;
    }

    @RequestMapping("/getOrderV3")
    public String getOrderV3() {
// 2.使用日志打印日志
        logger.trace("================= getOrderV3 ===============");
        wareHouseOpenFeignService.deductionInventory("1111");
        return "getOrderV3," ;
    }

}
