package com.penney.order.service.impl;

import com.penney.order.service.OrderService;
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
public class OrderServiceImpl implements OrderService {
    @Resource
    RestTemplate restTemplate;

    public String getOrder(){
        System.out.println("111111111");
        String url = "http://localhost:8082/warehouse/deductionInventory";
        String requestBody = "{\"key\":\"value\"}";
//        List<InstanceInfo> instancesByIds = discoveryClient.getInstancesById("product-service");




        HttpEntity<String> requestEntity = new HttpEntity(requestBody);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        return response.getBody();
    }
    public String getOrderV2(){
        System.out.println("getOrderV2");
        String url = "http://warehouse/warehouse/deductionInventory";
        String requestBody =  "{\"key\":\"value\"}";

        HttpEntity<String> requestEntity = new HttpEntity(requestBody);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        return response.getBody();
    }
}
