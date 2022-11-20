package com.konstde00.oop_patterns.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DraftState
		extends DocumentState {

	public DraftState(Document document) {
		super(document);
	}

	@Override
	public void publish(User user) {

		document.setCreatedByNickname(user.getNickname());
		document.setState(new InModerationState(document));
		log.info("Document is sent to moderation");
	}

	@Override
	public String toString() {
		return "Draft State";
	}
}
