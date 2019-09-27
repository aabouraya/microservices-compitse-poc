package com.knowhow.poc.composite.controller;

import com.knowhow.poc.composite.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/composite/{id}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String callCore(@PathVariable String id) {
        return productService.findCore(id);
    }
}
