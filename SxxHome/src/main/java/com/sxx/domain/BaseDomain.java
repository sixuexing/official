package com.sxx.domain;

public class BaseDomain {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseDomain [id=" + id + "]";
	}
	
}
