package com.konstde00.oop_patterns.creational.prototype;

import java.util.Map;

import static com.konstde00.oop_patterns.creational.prototype.ArchiverType.RAR;
import static com.konstde00.oop_patterns.creational.prototype.ArchiverType.ZIP;

public class ArchiverRegistry {
	
	private static final Map<ArchiverType, Archiver> prototypes;

	
	static {
		prototypes = Map.of(ZIP,new ZipArchiver(),
				RAR, new RarArchiver());
	}

	public static Archiver getPrototypeForType(ArchiverType archiverType) {
		return prototypes.get(archiverType).clone();
	}
}
