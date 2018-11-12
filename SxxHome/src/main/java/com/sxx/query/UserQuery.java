package com.sxx.query;

public class UserQuery {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserQuery(String username) {
		super();
		this.username = username;
	}

	public UserQuery() {
		super();
	}
	
}
