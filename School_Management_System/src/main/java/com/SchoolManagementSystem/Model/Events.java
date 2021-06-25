package com.SchoolManagementSystem.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="Events")
public class Events {

	/*
	 * ID is set as primary key and its value will be automatically generated in
	 * database
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;
	
	/* The description column should not be null. */
	@Column(nullable=false)
	private String description;
	
	/* The date_of_event column should not be null. */
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date_of_event;
	
	//default constructor with no fields
	public Events() {
		
	}
	
	// constructor with all fields
	public Events(long ID, String description, Date date_of_event) {
		super();
		this.ID = ID;
		this.description = description;
		this.date_of_event = date_of_event;
	}

	//getter & Setter for ID
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	//getter & Setter for description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//getter & Setter for date_of_event
	public Date getDate_of_event() {
		return date_of_event;
	}

	public void setDate_of_event(Date date_of_event) {
		this.date_of_event = date_of_event;
	}
	
	
	
	
	
}
