package com.knowhow.poc.composite.service.impl;

import com.knowhow.poc.composite.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RibbonClient(name = "core-product")
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final RestTemplate rest;


    @Override
    @HystrixCommand(fallbackMethod = "defaultFindCore")
    public String findCore(String id) {
        return rest.getForObject("http://core-product/core-service/{id}", String.class, id);
    }

    public String defaultFindCore(String id) {
        return "this is the default return for id: " + id;
    }

}
