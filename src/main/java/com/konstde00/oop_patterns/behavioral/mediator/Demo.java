package com.konstde00.oop_patterns.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		var tv = new Tv(mediator);
		var remoteControlButton = new Button(mediator);
		var display = new Display(mediator);
		
		mediator.setTv(tv);
		mediator.setPowerDisplay(display);
		
		log.info("fan.isOn(): " + tv.isOn());
		
		remoteControlButton.press();
		log.info("fan.isOn(): " + tv.isOn());
		
		remoteControlButton.press();
		log.info("fan.isOn(): " + tv.isOn());
	}
}
