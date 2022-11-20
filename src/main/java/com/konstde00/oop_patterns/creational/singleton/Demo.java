package com.konstde00.oop_patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {
		var orderManagService1 = OrderManagementService.getInstance();
		var orderManagService2 = OrderManagementService.getInstance();
		
//		var orderManagService3 = new OrderManagementService();
		
		log.info(String.valueOf(orderManagService1 == orderManagService2));
		orderManagService1.placeOrder();
	}

}
