package com.konstde00.oop_patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LuxuryCar
		extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void drive() {

		super.drive();

		log.info(" And drives soft as luxury car");
	}
}
