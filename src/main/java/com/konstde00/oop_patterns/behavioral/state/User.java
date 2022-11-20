package com.konstde00.oop_patterns.behavioral.state;

public class User {
	
	private Role role;
	private String nickname;

	public User(Role role, String nickname) {
		this.role = role;
		this.nickname = nickname;
	}

	public Role getRole() {
		return this.role;
	}
	
	public String getNickname() {
		return this.nickname;
	}
}
