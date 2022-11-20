package com.konstde00.oop_patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdvancedRemote
        extends BasicRemote {

    public AdvancedRemote(Device device) {
    	super(device);
    }

    public void mute() {
        log.info("Remote: mute");
        device.setVolume(0);
    }
}
