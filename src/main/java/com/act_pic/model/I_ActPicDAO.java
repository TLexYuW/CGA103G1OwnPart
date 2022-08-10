package com.act_pic.model;

import com.act.model.ActVO;

public interface I_ActPicDAO {

	// 取得 活動 照片
	ActVO findActPic(byte[] act_pic);
}
