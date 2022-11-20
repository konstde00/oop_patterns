package com.konstde00.oop_patterns.creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.konstde00.oop_patterns.creational.factorymethod.ArchiverType.RAR;
import static com.konstde00.oop_patterns.creational.factorymethod.ArchiverType.ZIP;

public class ArchiverFactory {

	private static final Map<ArchiverType, Supplier<Archiver>> typeConstructorMap;
	
	static {

		typeConstructorMap = Map.of(ZIP,  ZipArchiver::new,
				RAR, RarArchiver::new);

	}

	public static Archiver getArchiver(ArchiverType archiverType) {
		return typeConstructorMap.get(archiverType) == null ? null : 
					typeConstructorMap.get(archiverType).get();
	}
}
