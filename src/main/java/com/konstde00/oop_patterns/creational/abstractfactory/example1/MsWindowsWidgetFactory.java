package com.konstde00.oop_patterns.creational.abstractfactory.example1;

//ConcreteFactory1
public class MsWindowsWidgetFactory
		implements AbstractWidgetFactory {

	public Window createWindow() {
		return new MSWindow();

	}

	@Override
	public void createScroll() {
        new MSScroll();
    }

	@Override
	public void createNavigationButtons() {
		Button[] buttons = {
	               new MSButton("close window"),
	               new MSButton("expand window"),
	               new MSButton("collapse window"),
	               new MSButton("back"),
		};
	}
}
