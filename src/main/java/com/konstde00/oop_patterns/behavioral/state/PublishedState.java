package com.konstde00.oop_patterns.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PublishedState
		extends DocumentState {
	
	public PublishedState(Document document) {
		super(document);
	}

	@Override
	public void publish(User user) {
		log.info("Document is already published.");
	}

	@Override
	public String toString() {
		return "Published State";
	}
}
