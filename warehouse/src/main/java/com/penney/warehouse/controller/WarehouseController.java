package com.penney.warehouse.controller;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-07 12:42
 **/


import com.penney.warehouse.service.WarehouseService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Resource
    public WarehouseService warehouseService;
    // 1.得到日志对象
    private static Logger logger = LoggerFactory.getLogger(WarehouseController.class);

    @RequestMapping("/deductionInventory")
    public String deductionInventory( ) {
// 2.使用日志打印日志


        warehouseService.deductionInventory();
//        orderOpenFeignService.getInfo("");
        return "Hi," ;
    }
}
