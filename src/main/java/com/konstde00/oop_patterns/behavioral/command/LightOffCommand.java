package com.konstde00.oop_patterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

//Concrete Command 2
@Slf4j
public class LightOffCommand
		implements Command {

	// reference to the light

	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {

		light.switchOff();

		log.info("Light is off");
	}
}
