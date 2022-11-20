package com.konstde00.oop_patterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.List;

@Slf4j
public class ZipCompressionStrategy
		implements CompressionStrategy {

	@Override
	public void compressFiles(List<File> files) {
		//using ZIP approach
		log.info("Zip compression");
	}
}
