package com.konstde00.oop_patterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {

		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());

		// get a list of files...
		List<File> fileList = new ArrayList<>();
		ctx.createArchive(fileList);
		
		ctx.createArchive(fileList, file -> log.info("Any compression strategy here"));
		ctx.createArchive(fileList, Demo::customCompressStrategy);
		
		
		// Comparator is also strategy pattern.
		fileList.sort(Comparator.comparing(File::getName));

	}
	
	public static void customCompressStrategy(List<File> files) {
		log.info("Custom compression strategy");
	}
}
