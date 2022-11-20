package com.konstde00.oop_patterns.creational.abstractfactory.example1;

//Client
public class GUIBuilder {

	public void buildWindow(AbstractWidgetFactory widgetFactory) {
		Window window = widgetFactory.createWindow();
		window.setTitle("Just a new Window");
		widgetFactory.createScroll();
		widgetFactory.createNavigationButtons();
	}
}
