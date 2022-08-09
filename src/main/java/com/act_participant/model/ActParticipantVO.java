package com.act_participant.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ActParticipantVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer act_no;
	private Integer mem_no;
	private LocalDateTime enroll_time;
	private LocalDateTime enroll_status;
	
	public ActParticipantVO() {
	}

	public ActParticipantVO(Integer act_no, Integer mem_no, LocalDateTime enroll_time, LocalDateTime enroll_status) {
		this.act_no = act_no;
		this.mem_no = mem_no;
		this.enroll_time = enroll_time;
		this.enroll_status = enroll_status;
	}

	@Override
	public String toString() {
		return "ActParticipantVO [act_no=" + act_no + ", mem_no=" + mem_no + ", enroll_time=" + enroll_time
				+ ", enroll_status=" + enroll_status + "]";
	}
	
	
	
	
}
