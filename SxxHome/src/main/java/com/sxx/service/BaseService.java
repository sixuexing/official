package com.sxx.service;

import java.util.List;

public interface BaseService<T> {
	
	List<T> getAll();
	T getOne(Long id);
	void save(T t);
	void delete(Long id);
	void update(T t);
}
