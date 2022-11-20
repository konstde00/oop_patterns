package com.konstde00.oop_patterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultInternet
		implements Internet {

	@Override
	public void connectToHost(String url) {
		log.info("Successfully connected to " + url);
	}
}
