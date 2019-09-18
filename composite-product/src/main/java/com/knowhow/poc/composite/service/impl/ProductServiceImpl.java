package com.knowhow.poc.composite.service.impl;

import com.knowhow.poc.composite.service.ProductService;
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
    public String findCore(String id) {
        return rest.getForObject("http://CORE-PRODUCT/core-service/{id}", String.class, id);
    }



}
