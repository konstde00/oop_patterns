package com.konstde00.oop_patterns.creational.builder.chain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {
		Account account = Account.newBuilder()
                .setToken("Just a token for demo")
                .setUserId("Just a userId for demo")
                .build();
		log.info(account.toString());
	}
}
