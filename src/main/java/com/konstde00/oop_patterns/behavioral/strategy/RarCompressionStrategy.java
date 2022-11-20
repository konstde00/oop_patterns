package com.konstde00.oop_patterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.List;

@Slf4j
public class RarCompressionStrategy
		implements CompressionStrategy {

	@Override
	public void compressFiles(List<File> files) {
		// using RAR approach
		log.info("Rar compression");
	}
}
