package com.konstde00.oop_patterns.creational.abstractfactory.example1;


interface AbstractWidgetFactory {

	Window createWindow();
	void createScroll();
	void createNavigationButtons();
}
