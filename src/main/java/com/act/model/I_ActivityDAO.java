package com.act.model;

import java.util.List;

public interface I_ActivityDAO {
	
	void create(ActVO actVO);
	void update(ActVO actVO);
	void delete(ActVO actVO);
	
	List<ActVO> getAll();

	List<ActVO> getHostAct(Integer memNo);

	

	
}
