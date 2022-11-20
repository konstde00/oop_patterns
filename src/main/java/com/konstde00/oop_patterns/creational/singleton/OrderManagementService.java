package com.konstde00.oop_patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderManagementService {
	
	private static OrderManagementService instance;
	
	private OrderManagementService() {
	}
	
	public static synchronized OrderManagementService getInstance() {
		if (instance == null) {
			instance = new OrderManagementService();
		}
		return instance;
	}
	
	public void placeOrder() {
		log.info("Place order method is invoked");
	}
}
