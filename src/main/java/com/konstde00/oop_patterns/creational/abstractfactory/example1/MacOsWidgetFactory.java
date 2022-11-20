package com.konstde00.oop_patterns.creational.abstractfactory.example1;

//ConcreteFactory2
public class MacOsWidgetFactory
		implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		return new MacOsWindow();
	}

	@Override
	public void createScroll() {
        new MacOsScroll();
    }

	@Override
	public void createNavigationButtons() {
		Button[] buttons = {
		               new MacOsButton("close window"),
		               new MacOsButton("expand window"),
		               new MacOsButton("collapse window"),
		               new MacOsButton("back"),
		};
	}
}
