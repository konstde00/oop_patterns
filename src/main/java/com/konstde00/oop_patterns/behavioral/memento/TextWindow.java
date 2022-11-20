package com.konstde00.oop_patterns.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

// Originator class
@Slf4j
public class TextWindow {
	private StringBuilder textInWindow = new StringBuilder();

	public void write(String text) {
		this.textInWindow.append(text);
	}

	public TextWindowState save() {
		return new TextWindowState(textInWindow.toString());
	}

	public void restore(TextWindowState memento) {
		textInWindow = new StringBuilder(memento.getState());
	}
	
	public void print() {
		log.info(textInWindow.toString());
	}
}
