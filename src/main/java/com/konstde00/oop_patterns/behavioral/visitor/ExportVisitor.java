package com.konstde00.oop_patterns.behavioral.visitor;

public interface ExportVisitor extends Visitor {

	default void export(GeoElement... elements) {
		for (GeoElement geoElement : elements) {
			geoElement.accept(this);
		}
	}
}
