package com.testany.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp2")
@Data
public class Emp2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empno")
	public Integer empno;
	
	@Column(name = "ename")
	public String ename;
	
	@Column(name = "job")
	public String job;
	
	@Column(name = "hiredate")
	public LocalDate hiredate;
	
	@Column(name = "sal")
	public Double sal;
	
	@Column(name = "comm")
	public Double comm;
	
	@Column(name = "deptno")
	public Integer deptno;

	@Override
	public String toString() {
		return "emp2 [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comm, deptno, empno, ename, hiredate, job, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp2 other = (Emp2) obj;
		return Objects.equals(comm, other.comm) && Objects.equals(deptno, other.deptno)
				&& Objects.equals(empno, other.empno) && Objects.equals(ename, other.ename)
				&& Objects.equals(hiredate, other.hiredate) && Objects.equals(job, other.job)
				&& Objects.equals(sal, other.sal);
	}
	

}
