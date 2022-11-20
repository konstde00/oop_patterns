package com.konstde00.oop_patterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class B2BCustomer
		implements Observer {

	public B2BCustomer(OnlineStore onlineStore) {
		onlineStore.addListener(this);
	}

	public void update() {
		log.info("Goods arrived to the store. " +
				"Make your B2B order now");
	}
}
