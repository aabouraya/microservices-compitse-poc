package com.knowhow.poc.composite.controller;

import com.knowhow.poc.composite.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/core/{id}")
    public void callCore(@PathVariable String id) {
        productService.findCore(id);
    }
}
