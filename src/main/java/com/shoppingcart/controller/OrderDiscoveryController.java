package com.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;
import com.shoppingcart.model.OrderMaster;
import com.shoppingcart.util.OrderDataGenerator;

@Controller
@RequestMapping("/discover")
public class OrderDiscoveryController {
	
	private EurekaClient discoveryClient;
	private RestTemplate restTemplate;
	
	@Autowired
	public OrderDiscoveryController(EurekaClient discoveryClient) {
		this.discoveryClient = discoveryClient;
		restTemplate = new RestTemplate();
		
	}
	
	@RequestMapping(value="/post")
	public OrderMaster discoverAndPost() {
		
		// Generating a sample test order 
		OrderMaster orderParameter = new OrderDataGenerator().generateData();
		System.out.println("\n\n\n***** Retrieving EurekaURL ***** \n\n\n");
		String AppURL = discoveryClient.getNextServerFromEureka("ORDER-PRODUCER", false).getHomePageUrl();
//		String AppURL = "http://order-producer-fortypenny-gummite.app.dev.digifabricpcf.com/";

		AppURL = AppURL + "Order/putOrderToQueue";
		System.out.println("\n\n\n***** Before Calling postForObject ***** EurekaURL: " + AppURL + "\n\n\n");
		OrderMaster returnParameter = restTemplate.postForObject(AppURL, orderParameter, OrderMaster.class);
		System.out.println("\n\n\n***** After Calling postForObject *****" + returnParameter +" \n\n\n");

		return returnParameter;
		
	}
	

}
