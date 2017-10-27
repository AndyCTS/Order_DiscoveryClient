package com.shoppingcart.util;

import java.util.ArrayList;
import java.util.List;

import com.shoppingcart.model.OrderItem;
import com.shoppingcart.model.OrderMaster;

public class OrderDataGenerator {

	
	public OrderMaster generateData() {
		OrderItem oi = new OrderItem();
		
		oi.setType("Appliance");
		oi.setStatus("Available");
		oi.setPrice((float) 4000.00);
		oi.setName("Samsung");
		oi.setDescription("A TV to view at home");
		
		List<OrderItem> list = new ArrayList<OrderItem>();
		list.add(oi);
		
		OrderItem oi2 = new OrderItem();
		
		oi2.setType("Refrigerator");
		oi2.setStatus("Available");
		oi2.setPrice((float) 6000.00);
		oi2.setName("LG");
		oi2.setDescription("A consumer friendly refrigerator");
		
		list.add(oi2);
		//vars.put("create", u);
		
		OrderMaster o = new OrderMaster();
		o.setTotalAmount(10000);
		o.setStatus("Available");
		o.setOrderName("Home Appliances");
		o.setOrderItems(list);
		o.setOrderDescription("Order for Mrs. Jones");
		o.setOfferPercentage(30);
		o.setFinalAmount(9000);
		
		
		
		return o; 


	}

	
	
	
}

