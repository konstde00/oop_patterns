package com.konstde00.oop_patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

@Slf4j
public class RarArchiver
		implements Archiver, Serializable {

	@Override
	public void archive(File directory) {
		log.info("Rar archiver");
	}
	
	@Override
	public Archiver clone() {
		return SerializationUtils.clone(this);
	}
}
