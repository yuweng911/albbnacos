package com.penney.order.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName: orderService
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-29 20:41
 **/
@Service
public interface OrderService {
    String getOrder();
    String getOrderV2();

}
