package com.sambhav.collegefest.dal.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "collegestudenttable")
public class CollegeStudent {
	
	@Id
	private String studentid;
	private String studentbatch;
	private String studentcontact;
	private String studentfullname;
	
	public String getStudentid() {
		return studentid;
	}
	
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	
	public String getStudentbatch() {
		return studentbatch;
	}
	
	public void setStudentbatch(String studentbatch) {
		this.studentbatch = studentbatch;
	}
	
	public String getStudentcontact() {
		return studentcontact;
	}
	
	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}
	
	public String getStudentfullname() {
		return studentfullname;
	}
	
	public void setStudentfullname(String studentfullname) {
		this.studentfullname = studentfullname;
	}
	
	@Override
	public String toString() {
		return "CollegeStudent{" +
			"studentid='" + studentid + '\'' +
			", studentbatch='" + studentbatch + '\'' +
			", studentcontact='" + studentcontact + '\'' +
			", studentfullname='" + studentfullname + '\'' +
			'}';
	}
}
