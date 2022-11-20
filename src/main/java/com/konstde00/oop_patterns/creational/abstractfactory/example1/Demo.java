package com.konstde00.oop_patterns.creational.abstractfactory.example1;

public class Demo {
	
	public static void main(final String[] args) {
		GUIBuilder builder = new GUIBuilder();

		AbstractWidgetFactory widgetFactory;
		Platform platform = Platform.MAC_OSX;

		if (platform.equals(Platform.MAC_OSX)) {
			widgetFactory = new MacOsWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
}
