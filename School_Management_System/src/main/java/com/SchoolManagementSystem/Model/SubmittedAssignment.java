package com.SchoolManagementSystem.Model;


import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name =  "submitted_assignment")
public class SubmittedAssignment {
	
	
	@Id
	private long reg_id;
	private long assignment_id;	
    private String student_name;
	private LocalDate uploadtime;
    private String filename ;
    private String datatype;
    
	
	@Lob
	private byte[] data;
	
	
	
	public SubmittedAssignment() {
		super();
	}
	public SubmittedAssignment(long assignment_id, long reg_id, String student_name, LocalDate uploadtime, String filename,
			String datatype, byte[] data) {
		super();
		this.assignment_id = assignment_id;
		this.reg_id = reg_id;
		this.student_name = student_name;
		this.uploadtime = uploadtime;
		this.filename = filename;
		this.datatype = datatype;
		this.data = data;
	}
	public long getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(long assignment_id) {
		this.assignment_id = assignment_id;
	}
	public long getReg_id() {
		return reg_id;
	}
	public void setReg_id(long reg_id) {
		this.reg_id = reg_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public LocalDate getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(LocalDate uploadtime) {
		this.uploadtime = uploadtime;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}

	
}
