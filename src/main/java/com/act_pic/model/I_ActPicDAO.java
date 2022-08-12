package com.act_pic.model;

import java.util.List;

import com.act.model.ActVO;

public interface I_ActPicDAO {

	// 新增 活動照片
	void insert(ActPicVO actPicVO);

	// 更新、修改 活動照片
	ActPicVO update(Integer actPicNo);
	
	// 取得 活動 照片
	ActVO findActPic(byte[] actPic);
	
	List<ActPicVO> getAll(byte[] actPic);
	
	
}
