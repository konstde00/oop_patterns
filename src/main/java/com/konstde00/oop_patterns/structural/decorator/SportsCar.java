package com.konstde00.oop_patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SportsCar
		extends CarDecorator {

	private String transmissionMode;

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void drive() {
		super.drive();
		log.info(" And drives fast like a Sports Car");
	}

	public String getTransmissionMode() {
		return transmissionMode;
	}
	
	public void setTransmissionMode(String transmissionMode) {
		this.transmissionMode = transmissionMode;
	}
}
