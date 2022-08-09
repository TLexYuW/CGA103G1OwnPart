package com.ac_msg.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AcMsgVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer ac_msg_no;
	private Integer emp_no;
	private Integer mem_no;
	private Integer ac_no;
	private Integer ac_msg_reason;
	private LocalDateTime ac_msg_done_time;
	private Integer ac_msg_status;
	private String ac_msg_note;
	
	public AcMsgVo() {
	}

	public AcMsgVo(Integer ac_msg_no, Integer emp_no, Integer mem_no, Integer ac_no, Integer ac_msg_reason,
			LocalDateTime ac_msg_done_time, Integer ac_msg_status, String ac_msg_note) {
		this.ac_msg_no = ac_msg_no;
		this.emp_no = emp_no;
		this.mem_no = mem_no;
		this.ac_no = ac_no;
		this.ac_msg_reason = ac_msg_reason;
		this.ac_msg_done_time = ac_msg_done_time;
		this.ac_msg_status = ac_msg_status;
		this.ac_msg_note = ac_msg_note;
	}

	@Override
	public String toString() {
		return "AcMsgVo [ac_msg_no=" + ac_msg_no + ", emp_no=" + emp_no + ", mem_no=" + mem_no + ", ac_no=" + ac_no
				+ ", ac_msg_reason=" + ac_msg_reason + ", ac_msg_done_time=" + ac_msg_done_time + ", ac_msg_status="
				+ ac_msg_status + ", ac_msg_note=" + ac_msg_note + "]";
	}

	
	
	
}
