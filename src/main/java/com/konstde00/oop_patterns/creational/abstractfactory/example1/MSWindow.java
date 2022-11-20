package com.konstde00.oop_patterns.creational.abstractfactory.example1;

//ConcreteProduct1
public class MSWindow
		implements Window {

	public void repaint() {
		// MS Windows specific behaviour
	}

	@Override
	public void setTitle(final String text) {
	}
}
