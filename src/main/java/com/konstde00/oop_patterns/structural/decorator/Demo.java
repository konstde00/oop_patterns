package com.konstde00.oop_patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	public static void main(final String[] args) {

		Car basicCar = new BasicCar();
		basicCar.drive();
		log.info(System.lineSeparator());
		
		SportsCar sportsCar = new SportsCar(new BasicCar());
		sportsCar.drive();
		sportsCar.setTransmissionMode("sport+");
		log.info(System.lineSeparator());

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.drive();
		log.info(System.lineSeparator());
	}
}
