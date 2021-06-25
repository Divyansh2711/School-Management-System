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
@Table(name="News")
public class News {

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
	
	/* The date_of_announcement column should not be null. */
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date_of_announcement;
	
	//default constructor with no fields
	public News() {
		
	}
	
	// constructor with all fields
	public News(long ID, String description, Date date_of_announcement) {
		super();
		this.ID = ID;
		this.description = description;
		this.date_of_announcement = date_of_announcement;
	}

	//getter & Setter for ID
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	//getter & Setter for description.
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//getter & Setter for date_of_announcement.
	public Date getDate_of_announcement() {
		return date_of_announcement;
	}

	public void setDate_of_announcement(Date date_of_announcement) {
		this.date_of_announcement = date_of_announcement;
	}
	
	
	
	
	
}
