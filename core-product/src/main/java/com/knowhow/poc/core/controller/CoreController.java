package com.knowhow.poc.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @GetMapping("/core-product")
    public String getCore(){
        return "Core Product with Id ";
    }
}
