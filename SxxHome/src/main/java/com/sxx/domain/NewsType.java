package com.sxx.domain;

public class NewsType {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NewsType(Long id, String name) {
		this.name = name;
	}
	public NewsType() {
	}
	@Override
	public String toString() {
		return "NewsType [ name=" + name + "]";
	}
	
}
