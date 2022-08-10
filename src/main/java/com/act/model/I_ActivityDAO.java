package com.act.model;

import java.time.LocalDateTime;
import java.util.List;

public interface I_ActivityDAO {
	
	// 建立揪團活動
	void insert(ActVO actVO);
	
	// 更新、修改 揪團條件 (不包含 活動狀態)
	void update(ActVO actVO);
	
	/*
	 *  更新 活動狀態，如果 活動報名截止時間到，目前人數未達最少人數
	 *  則 將 活動狀態 改為 已取消。
	 *  反之，活動報名截止時間到，報名人數>=最少人數，狀態改為已成團。
	 */
	void updateActStatus(Integer actStatus);
	
	// 取得 所有揪團活動
	List<ActVO> getAll();

	// 取得 揪團舉辦者的所有揪團活動 
	List<ActVO> getHostAct(Integer memNo);
	
	// 查詢 特定種類 活動列表
	List<ActVO> findActByType(Integer actTypeNo);
	
	// 查詢 活動報名起始日期之後活動列表 ActEnrollBegin
	List<ActVO> findAEB(LocalDateTime actEnrollBegin);
	
	// 查詢 活動報名截止日期之後活動列表 ActEnrollEnd
	List<ActVO> findAEE(LocalDateTime actEnrollEnd);
	
	// 查詢、篩選 活動報名起訖日期區間的活動列表 ActEnrollBegin & ActEnrollEnd
	List<ActVO> findAEBE(LocalDateTime actEnrollBegin, LocalDateTime actEnrollEnd);
	
	// 查詢、篩選 活動開始結束日期區間的活動列表 ActStart & ActEnd
	List<ActVO> findASBE(LocalDateTime actStart, LocalDateTime actEnd);
		
	// 取得 活動 符合 篩選之評價平均數(評價總星數 / 評價總人數) 的活動列表 
	List<ActVO> getActEvalAvg(Integer actRateSum, Integer actEvalSum);
	
	// 取得	活動 舉辦縣市列表
	List<ActVO> getActLoc(Integer actLoc);
	
	// 取得	活動起訖時間區間之活動列表 ActStarEndTime
	List<ActVO> getASET(LocalDateTime actStart, LocalDateTime actEnd);
	
	
	
	

	

	
}
