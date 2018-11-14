package com.sxx.mapper;

import java.util.List;

public interface BaseMapper<T> {
	List selectAll();
	T selectOne(Long id);
	void add(T t);
	void delete(Long id);
	void update(T t);
}	
