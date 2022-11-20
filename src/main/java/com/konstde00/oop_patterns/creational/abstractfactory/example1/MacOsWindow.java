package com.konstde00.oop_patterns.creational.abstractfactory.example1;

//ConcreteProduct2
public class MacOsWindow
		implements Window {

	@Override
	public void repaint() {
		// Mac OSX specific behaviour
	}

	@Override
	public void setTitle(final String text) {
	}
}
