package com.konstde00.oop_patterns.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {

		CrossCompiler iphone = new IPhoneCompiler();
		iphone.compile();
		log.info(System.lineSeparator());
		CrossCompiler android = new AndroidCompiler();
		android.compile();
	}
}
