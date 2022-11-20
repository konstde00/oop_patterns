package com.konstde00.oop_patterns.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {

		TextEditor textEditor = new TextEditor();
		TextWindow textWindow = new TextWindow();
		textWindow.write("Memento is a behavioral GoF pattern." + System.lineSeparator());
		textEditor.save(textWindow.save());
		textWindow.write("This is example of memento pattern implementation");
		textEditor.save(textWindow.save());
		
		textWindow.print();
		log.info("===============================");
		textWindow.restore(textEditor.getStateBySnapshotIndex(0));
		
		textWindow.print();
		log.info("===============================");
		textWindow.restore(textEditor.getStateBySnapshotIndex(1));
		
		textWindow.print();
	}
}

