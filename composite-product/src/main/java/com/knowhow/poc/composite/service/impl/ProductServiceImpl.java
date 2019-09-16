package com.knowhow.poc.composite.service.impl;

import com.knowhow.poc.composite.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public String findCore(String id) {
        return new RestTemplate().getForObject("http://localhost:9090/core-product/", String.class, id);
    }
}
