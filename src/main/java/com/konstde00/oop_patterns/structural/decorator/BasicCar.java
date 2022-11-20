package com.konstde00.oop_patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasicCar implements Car {

	@Override
	public void drive() {
		log.info("Basic Car Drives");
	}
}
