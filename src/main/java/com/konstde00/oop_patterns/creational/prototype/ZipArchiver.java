package com.konstde00.oop_patterns.creational.prototype;

import java.io.File;
import java.io.Serializable;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;

@Slf4j
public class ZipArchiver
		implements Archiver, Serializable {

	@Override
	public void archive(File directory) {
		log.info("Zip Archiver");
	}

	@Override
	public Archiver clone() {
		return SerializationUtils.clone(this);
	}
}
