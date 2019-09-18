package com.knowhow.poc.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @GetMapping("/core-service/{id}")
    public String getCore(@PathVariable String id){
        return "Core Product with Id " + id;
    }
}
