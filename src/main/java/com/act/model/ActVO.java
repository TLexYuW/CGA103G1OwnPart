package com.act.model;

import java.io.Serializable;

public class ActVO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer act_no;
	private Integer men_no;
	private Integer act_type_no;
	private String act_title;
	private String act_content;
	private Integer act_current_count;
	private Integer act_max_count;
	private Integer act_min_count;
	private Integer act_enroll_begin;
	private Integer act_enroll_end;
	private Integer act_start;
	private Integer act_end;
	private String act_loc;
	private String act_pl;
	private Integer act_rate_sum;
	private Integer eval_sum;
	private Boolean act_status;
	
	public ActVO() {
	}

	public ActVO(Integer act_no, Integer men_no, Integer act_type_no, String act_title, String act_content,
			Integer act_current_count, Integer act_max_count, Integer act_min_count, Integer act_enroll_begin,
			Integer act_enroll_end, Integer act_start, Integer act_end, String act_loc, String act_pl,
			Integer act_rate_sum, Integer eval_sum, Boolean act_status) {
		this.act_no = act_no;
		this.men_no = men_no;
		this.act_type_no = act_type_no;
		this.act_title = act_title;
		this.act_content = act_content;
		this.act_current_count = act_current_count;
		this.act_max_count = act_max_count;
		this.act_min_count = act_min_count;
		this.act_enroll_begin = act_enroll_begin;
		this.act_enroll_end = act_enroll_end;
		this.act_start = act_start;
		this.act_end = act_end;
		this.act_loc = act_loc;
		this.act_pl = act_pl;
		this.act_rate_sum = act_rate_sum;
		this.eval_sum = eval_sum;
		this.act_status = act_status;
	}

	
	public Integer getAct_no() {
		return act_no;
	}

	public void setAct_no(Integer act_no) {
		this.act_no = act_no;
	}

	public Integer getMen_no() {
		return men_no;
	}

	public void setMen_no(Integer men_no) {
		this.men_no = men_no;
	}

	public Integer getAct_type_no() {
		return act_type_no;
	}

	public void setAct_type_no(Integer act_type_no) {
		this.act_type_no = act_type_no;
	}

	public String getAct_title() {
		return act_title;
	}

	public void setAct_title(String act_title) {
		this.act_title = act_title;
	}

	public String getAct_content() {
		return act_content;
	}

	public void setAct_content(String act_content) {
		this.act_content = act_content;
	}

	public Integer getAct_current_count() {
		return act_current_count;
	}

	public void setAct_current_count(Integer act_current_count) {
		this.act_current_count = act_current_count;
	}

	public Integer getAct_max_count() {
		return act_max_count;
	}

	public void setAct_max_count(Integer act_max_count) {
		this.act_max_count = act_max_count;
	}

	public Integer getAct_min_count() {
		return act_min_count;
	}

	public void setAct_min_count(Integer act_min_count) {
		this.act_min_count = act_min_count;
	}

	public Integer getAct_enroll_begin() {
		return act_enroll_begin;
	}

	public void setAct_enroll_begin(Integer act_enroll_begin) {
		this.act_enroll_begin = act_enroll_begin;
	}

	public Integer getAct_enroll_end() {
		return act_enroll_end;
	}

	public void setAct_enroll_end(Integer act_enroll_end) {
		this.act_enroll_end = act_enroll_end;
	}

	public Integer getAct_start() {
		return act_start;
	}

	public void setAct_start(Integer act_start) {
		this.act_start = act_start;
	}

	public Integer getAct_end() {
		return act_end;
	}

	public void setAct_end(Integer act_end) {
		this.act_end = act_end;
	}

	public String getAct_loc() {
		return act_loc;
	}

	public void setAct_loc(String act_loc) {
		this.act_loc = act_loc;
	}

	public String getAct_pl() {
		return act_pl;
	}

	public void setAct_pl(String act_pl) {
		this.act_pl = act_pl;
	}

	public Integer getAct_rate_sum() {
		return act_rate_sum;
	}

	public void setAct_rate_sum(Integer act_rate_sum) {
		this.act_rate_sum = act_rate_sum;
	}

	public Integer getEval_sum() {
		return eval_sum;
	}

	public void setEval_sum(Integer eval_sum) {
		this.eval_sum = eval_sum;
	}

	public Boolean getAct_status() {
		return act_status;
	}

	public void setAct_status(Boolean act_status) {
		this.act_status = act_status;
	}

	
	@Override
	public String toString() {
		return "ActVO [act_no=" + act_no + ", men_no=" + men_no + ", act_type_no=" + act_type_no + ", act_title="
				+ act_title + ", act_content=" + act_content + ", act_current_count=" + act_current_count
				+ ", act_max_count=" + act_max_count + ", act_min_count=" + act_min_count + ", act_enroll_begin="
				+ act_enroll_begin + ", act_enroll_end=" + act_enroll_end + ", act_start=" + act_start + ", act_end="
				+ act_end + ", act_loc=" + act_loc + ", act_pl=" + act_pl + ", act_rate_sum=" + act_rate_sum
				+ ", eval_sum=" + eval_sum + ", act_status=" + act_status + "]";
	}

}