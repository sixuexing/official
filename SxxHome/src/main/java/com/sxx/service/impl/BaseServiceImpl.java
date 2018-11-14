package com.sxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sxx.mapper.BaseMapper;
import com.sxx.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	@Autowired
	private BaseMapper<T> baseMapper;
	
	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return baseMapper.selectAll();
	}

	@Override
	public T getOne(Long id) {
		// TODO Auto-generated method stub
		return baseMapper.selectOne(id);
	}

	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		baseMapper.add(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		baseMapper.delete(id);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		baseMapper.update(t);
	}

}
