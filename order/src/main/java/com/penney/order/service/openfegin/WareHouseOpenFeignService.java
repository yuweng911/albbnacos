package com.penney.order.service.openfegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: OrderService
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-27 14:46
 **/
@FeignClient(value="warehouse", path="/warehouse")
public interface WareHouseOpenFeignService {
        //这里注解里参数，要和远程服务的一致
        @GetMapping("/deductionInventory")
        String deductionInventory(@RequestParam("name")String name);



}
