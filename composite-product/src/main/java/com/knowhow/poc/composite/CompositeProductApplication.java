package com.knowhow.poc.composite;

import com.knowhow.poc.composite.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableConfigurationProperties({AppProperties.class})
public class CompositeProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeProductApplication.class, args);
	}

}
