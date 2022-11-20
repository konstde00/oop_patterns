package com.konstde00.oop_patterns.creational.factorymethod;

import java.io.File;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;

@Slf4j
public class RarArchiver
		implements Archiver {

	@Override
	public void archive(File directory) {
		log.info("Rar archiver");
	}
}
