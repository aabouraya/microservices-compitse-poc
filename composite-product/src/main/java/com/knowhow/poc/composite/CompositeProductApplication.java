package com.knowhow.poc.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CompositeProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeProductApplication.class, args);
	}

}
