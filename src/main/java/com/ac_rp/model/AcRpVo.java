package com.ac_rp.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AcRpVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ac_rp_no;
	private Integer emp_no;
	private Integer  mem_no;
	private Integer  ac_no;
	private Integer  ac_rp_reason;
	private LocalDateTime ac_rp_time;
	private LocalDateTime ac_rp_done_time;
	private Integer ac_rp_status;
	private String ac_rp_note;
	
	public AcRpVo() {
	}

	public AcRpVo(Integer ac_rp_no, Integer emp_no, Integer mem_no, Integer ac_no, Integer ac_rp_reason,
			LocalDateTime ac_rp_time, LocalDateTime ac_rp_done_time, Integer ac_rp_status, String ac_rp_note) {
		this.ac_rp_no = ac_rp_no;
		this.emp_no = emp_no;
		this.mem_no = mem_no;
		this.ac_no = ac_no;
		this.ac_rp_reason = ac_rp_reason;
		this.ac_rp_time = ac_rp_time;
		this.ac_rp_done_time = ac_rp_done_time;
		this.ac_rp_status = ac_rp_status;
		this.ac_rp_note = ac_rp_note;
	}

	public Integer getAc_rp_no() {
		return ac_rp_no;
	}

	public void setAc_rp_no(Integer ac_rp_no) {
		this.ac_rp_no = ac_rp_no;
	}

	public Integer getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(Integer emp_no) {
		this.emp_no = emp_no;
	}

	public Integer getMem_no() {
		return mem_no;
	}

	public void setMem_no(Integer mem_no) {
		this.mem_no = mem_no;
	}

	public Integer getAc_no() {
		return ac_no;
	}

	public void setAc_no(Integer ac_no) {
		this.ac_no = ac_no;
	}

	public Integer getAc_rp_reason() {
		return ac_rp_reason;
	}

	public void setAc_rp_reason(Integer ac_rp_reason) {
		this.ac_rp_reason = ac_rp_reason;
	}

	public LocalDateTime getAc_rp_time() {
		return ac_rp_time;
	}

	public void setAc_rp_time(LocalDateTime ac_rp_time) {
		this.ac_rp_time = ac_rp_time;
	}

	public LocalDateTime getAc_rp_done_time() {
		return ac_rp_done_time;
	}

	public void setAc_rp_done_time(LocalDateTime ac_rp_done_time) {
		this.ac_rp_done_time = ac_rp_done_time;
	}

	public Integer getAc_rp_status() {
		return ac_rp_status;
	}

	public void setAc_rp_status(Integer ac_rp_status) {
		this.ac_rp_status = ac_rp_status;
	}

	public String getAc_rp_note() {
		return ac_rp_note;
	}

	public void setAc_rp_note(String ac_rp_note) {
		this.ac_rp_note = ac_rp_note;
	}

	@Override
	public String toString() {
		return "AcRpVo [ac_rp_no=" + ac_rp_no + ", emp_no=" + emp_no + ", mem_no=" + mem_no + ", ac_no=" + ac_no
				+ ", ac_rp_reason=" + ac_rp_reason + ", ac_rp_time=" + ac_rp_time + ", ac_rp_done_time="
				+ ac_rp_done_time + ", ac_rp_status=" + ac_rp_status + ", ac_rp_note=" + ac_rp_note + "]";
	}

	
	
	
}
