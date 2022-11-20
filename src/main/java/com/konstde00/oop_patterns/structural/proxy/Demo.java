package com.konstde00.oop_patterns.structural.proxy;

public class Demo {
	
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		
		internet.connectToHost("knu.ua");
		internet.connectToHost("facebook.com");
	}
}
