package com.nikolaserafini.MonHunBase.dao;

import java.util.List;


public interface GenericDAO<TYPE> {

	public List<TYPE> selectAll();
	public TYPE getById(Integer id);
	public void update(TYPE t);
	public void save(TYPE t);
	
}
