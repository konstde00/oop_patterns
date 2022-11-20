package com.konstde00.oop_patterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

//Concrete Command 1
@Slf4j
public class LightOnCommand
		implements Command {

	// reference to the light
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {

		light.switchOn();

		log.info("Light is on");
	}
}

