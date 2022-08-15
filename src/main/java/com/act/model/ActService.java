package com.act.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ActService {
	
	private I_ActDAO dao;
	
	public ActService() {
		dao = new ActDAO();
	}
	
	// 創建揪團活動
	public ActVO createAct(Integer men_no, Integer act_type_no, String act_title
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
	
	// 更新揪團活動
	public ActVO updateAct(Integer act_type_no, String act_title
			, String act_content, Integer act_current_count, Integer act_max_count
			, Integer act_min_count, LocalDateTime act_enroll_begin,
			LocalDateTime act_enroll_end, LocalDateTime act_start, LocalDateTime act_end
			, Integer act_loc, String act_pl) {
		
		ActVO actVO = new ActVO();
		
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
		
		dao.update(actVO);
		
		return actVO;			
	}
	
	// 更新活動狀態
	public ActVO updateActStatus(Integer act_no, Integer act_status) {
		ActVO actVO = new ActVO();
		
		actVO.setAct_no(act_no);
		actVO.setAct_status(act_status);
				
		dao.updateActStatus(actVO);
		
		return actVO;
	}

	// 為 揪團活動 評價 增加 星數 & 評價人數
	public ActVO updateRateEval(Integer act_rate_sum, Integer eval_sum, Integer act_no) {
		ActVO actVO = new ActVO();		
		actVO.setAct_rate_sum(act_rate_sum);
		actVO.setEval_sum(eval_sum);
		actVO.setAct_no(act_no);
		
		dao.updateActStatus(actVO);
		
		return actVO;
	}
	
	// 取得所有揪團活動的所有資訊
	public List<ActVO> getAll() {
		return dao.getAll()
				.stream()
				.filter(act -> act.getAct_status() == 0)
				.collect(Collectors.toList());
	};
	
}
