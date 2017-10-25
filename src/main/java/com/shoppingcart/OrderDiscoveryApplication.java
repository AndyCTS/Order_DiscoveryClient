package com.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class OrderDiscoveryApplication {
	
	public static void main(String[] args) {
		System.out.println(" **** In here **** ");
		SpringApplication.run(OrderDiscoveryApplication.class, args);
	}
	
}
