package com.konstde00.oop_patterns.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Document {
	
	private State state;
	private String createdByNickname;
	private String moderatedByNickname;
	private String publishedByNickname;
	
	public Document() {
		this.state = new DraftState(this);
	}
	
	public void publish(User user) {
		this.state.publish(user);
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setPublishedByNickname(String nickname) {
		this.publishedByNickname = nickname;
	}

	public void setModeratedByNickname(String nickname) {
		this.moderatedByNickname = nickname;
	}

	public void setCreatedByNickname(String nickname) {
		this.createdByNickname = nickname;
	}

	public void printStatus() {

		log.info("===== Document Status =====");
		log.info("Created by: " + this.createdByNickname);
		log.info("Moderated by: " + this.moderatedByNickname);
		log.info("Published by: " + this.publishedByNickname);
		log.info("State: " + this.state.toString());
		log.info("============================");
	}
}
