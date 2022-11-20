package com.konstde00.oop_patterns.behavioral.state;

import lombok.extern.slf4j.Slf4j;

import static com.konstde00.oop_patterns.behavioral.state.Role.ADMIN_ROLE;

@Slf4j
public class InModerationState
		extends DocumentState {

	public InModerationState(Document document) {
		super(document);
	}

	@Override
	public void publish(User user) {
		if(user.getRole().equals(ADMIN_ROLE)) {
			document.setState(new PublishedState(document));
			document.setModeratedByNickname(user.getNickname());
			document.setPublishedByNickname(user.getNickname());
			log.info("Document is published");
		} else {
			log.info("You are not admin and can't publish content.");
		}
	}

	@Override
	public String toString() {
		return "In Moderation State";
	}
}
