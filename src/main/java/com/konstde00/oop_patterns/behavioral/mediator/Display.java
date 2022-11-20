package com.konstde00.oop_patterns.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Display {
	
	private Mediator mediator;
	
    public Display(Mediator mediator) {
    	this.mediator = mediator;
    }

	public void turnOn() {
        log.info("Display is turned on");
    }

    public void turnOff() {
    	log.info("Display is turned off");
    }
}
