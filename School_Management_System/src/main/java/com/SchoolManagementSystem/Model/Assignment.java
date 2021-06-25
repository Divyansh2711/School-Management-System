package com.SchoolManagementSystem.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Assignments")
public class Assignment {

	/*
	 * ID is set as primary key and its value will be automatically generated in
	 * database
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String subject;
	private String slass;
	private String description;
	private Date deadline;
	private String filename;
	private String datatype;

	@Lob
	private byte[] data;

	// default constructor with no fields
	public Assignment() {
		super();
	}

	// constructor with all fields
	public Assignment(String subject, String slass, String description, byte[] data, Date deadline, String filename,
			String datatype) {
		super();

		this.subject = subject;
		this.slass = slass;
		this.description = description;
		this.data = data;
		this.deadline = deadline;
		this.setFilename(filename);
		this.setDatatype(datatype);

	}

    //getter and setter methods for all the fields.
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSlass() {
		return slass;
	}

	public void setSlass(String slass) {
		this.slass = slass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
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

}
