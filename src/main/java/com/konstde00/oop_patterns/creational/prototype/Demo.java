package com.konstde00.oop_patterns.creational.prototype;

import java.io.File;

public class Demo {
	
	public static void main(String[] args) {

		ArchiverType archiverType1 = ArchiverType.ZIP;
		ArchiverType archiverType2 = ArchiverType.RAR;
		
		Archiver zipArchiver = ArchiverRegistry.getPrototypeForType(archiverType1);
		Archiver rarArchiver = ArchiverRegistry.getPrototypeForType(archiverType2);
		
		zipArchiver.archive(new File("just/demo/file/path"));
		rarArchiver.archive(new File("just/demo/file/path"));
	}
}
