package com.konstde00.oop_patterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {
		Archiver zipArchiver = ArchiverFactory.getArchiver(ArchiverType.ZIP);
		Archiver rarArchiver = ArchiverFactory.getArchiver(ArchiverType.RAR);

		zipArchiver.archive(new File("just/demo/file/path"));
		rarArchiver.archive(new File("just/demo/file/path"));
		
		log.info(String.valueOf(ArchiverFactory.getArchiver(ArchiverType.ZIP) == zipArchiver));
	}
}
