package com.penney.warehouse.service.impl;

import com.penney.warehouse.service.WarehouseService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderServiceImpl
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-29 20:42
 **/
@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    RestTemplate restTemplate;

    public String deductionInventory(){
        System.out.println("扣库存成功！");
//        String url = "http://order3/user/sayhi";
//        String requestBody = "{\"key\":\"value\"}";
////        List<InstanceInfo> instancesByIds = discoveryClient.getInstancesById("product-service");
//
//
//
//
//        HttpEntity<String> requestEntity = new HttpEntity(requestBody);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        return "";
    }
}
