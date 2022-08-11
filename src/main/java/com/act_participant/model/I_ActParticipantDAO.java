package com.act_participant.model;

import java.util.List;

public interface I_ActParticipantDAO {

	
	// 新增 活動參與者
	void insertActParti(ActParticipantVO actParticipantVO);
	
	// 更新、修改 活動參與者 報名狀態 ? 審核 活動參與者 ?
	void updateActParti(ActParticipantVO actParticipantVO);
	
	// 取得 所有 活動參與者
	List<ActParticipantVO> getAll();
	
	// 取得該揪團活動之所有報名參團者
	List<ActParticipantVO> getAll(Integer ActNo);
	
	// 取得 活動參與者 報名狀態 ActParticipantEnrollStatus
	ActParticipantVO getAPES();
		

}
