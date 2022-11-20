package com.konstde00.oop_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet
		implements Internet {
	
	private final Internet INTERNET
			= new DefaultInternet();
	private static final List<String> BANNED_SITES;

	static {
		BANNED_SITES = List.of("facebook.com", "instagram.com");
	}

	@Override
	public void connectToHost(String url) {
		if (BANNED_SITES.contains(url.toLowerCase())) {
			throw new RuntimeException("Access Denied: connecting to " + url);
		}
		INTERNET.connectToHost(url);
	}
}
