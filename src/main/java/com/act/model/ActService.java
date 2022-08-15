package com.act.model;

import java.time.LocalDateTime;

public class ActService {
	
	private I_ActDAO dao;
	
	public ActService() {
		dao = new ActDAO();
	}
	
	public ActVO CreateAct(Integer men_no, Integer act_type_no, String act_title
			, String act_content, Integer act_current_count, Integer act_max_count
			, Integer act_min_count, LocalDateTime act_enroll_begin,
			LocalDateTime act_enroll_end, LocalDateTime act_start, LocalDateTime act_end
			, Integer act_loc, String act_pl) {
		ActVO actVO = new ActVO();
		actVO.setMen_no(men_no);
		actVO.setAct_type_no(act_type_no);
		actVO.setAct_title(act_title);
		actVO.setAct_content(act_content);
		actVO.setAct_current_count(act_current_count);
		actVO.setAct_min_count(act_max_count);
		actVO.setAct_max_count(act_min_count);
		actVO.setAct_enroll_begin(act_enroll_begin);
		actVO.setAct_enroll_end(act_enroll_end);
		actVO.setAct_start(act_start);			
		actVO.setAct_end(act_end);
		actVO.setAct_loc(act_loc);			
		actVO.setAct_pl(act_pl);
		
		dao.insert(actVO);
		
		return actVO;
	}
	

}
