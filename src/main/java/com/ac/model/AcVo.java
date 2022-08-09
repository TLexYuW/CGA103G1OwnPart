package com.ac.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AcVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ac_no;
	private Integer mem_no;
	private Integer ac_type_no;
	private String ac_title;
	private String ac_content;
	private LocalDateTime ac_time;
	private Integer ac_update;
	
	public AcVo() {
	}

	public AcVo(Integer ac_no, Integer mem_no, Integer ac_type_no, String ac_title, String ac_content,
			LocalDateTime ac_time, Integer ac_update) {
		this.ac_no = ac_no;
		this.mem_no = mem_no;
		this.ac_type_no = ac_type_no;
		this.ac_title = ac_title;
		this.ac_content = ac_content;
		this.ac_time = ac_time;
		this.ac_update = ac_update;
	}

	public Integer getAc_no() {
		return ac_no;
	}

	public void setAc_no(Integer ac_no) {
		this.ac_no = ac_no;
	}

	public Integer getMem_no() {
		return mem_no;
	}

	public void setMem_no(Integer mem_no) {
		this.mem_no = mem_no;
	}

	public Integer getAc_type_no() {
		return ac_type_no;
	}

	public void setAc_type_no(Integer ac_type_no) {
		this.ac_type_no = ac_type_no;
	}

	public String getAc_title() {
		return ac_title;
	}

	public void setAc_title(String ac_title) {
		this.ac_title = ac_title;
	}

	public String getAc_content() {
		return ac_content;
	}

	public void setAc_content(String ac_content) {
		this.ac_content = ac_content;
	}

	public LocalDateTime getAc_time() {
		return ac_time;
	}

	public void setAc_time(LocalDateTime ac_time) {
		this.ac_time = ac_time;
	}

	public Integer getAc_update() {
		return ac_update;
	}

	public void setAc_update(Integer ac_update) {
		this.ac_update = ac_update;
	}

	@Override
	public String toString() {
		return "AcVo [ac_no=" + ac_no + ", mem_no=" + mem_no + ", ac_type_no=" + ac_type_no + ", ac_title=" + ac_title
				+ ", ac_content=" + ac_content + ", ac_time=" + ac_time + ", ac_update=" + ac_update + "]";
	}
	
}
