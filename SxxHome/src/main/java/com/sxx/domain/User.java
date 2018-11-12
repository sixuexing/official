package com.sxx.domain;

import java.util.Date;

public class User {
	private Long id;
	private String username;
	private String password;
	private Date date = new Date();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User(Long id, String username, String password, Date date) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.date = date;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", date=" + date + "]";
	}
	
	

}
