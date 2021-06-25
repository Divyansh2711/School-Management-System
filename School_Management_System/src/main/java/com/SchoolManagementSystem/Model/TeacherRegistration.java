package com.SchoolManagementSystem.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Teacher")
public class TeacherRegistration {
	/*
	 * ID is set as primary key and its value will be automatically generated by
	 * database
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ID;
	
	
	/* The firstName coulmn should not be null. */
	@Column(nullable=false)
	private String first_Name;
	
	/* The LastName coulmn should not be null. */
	@Column(nullable=false)
	private String last_Name;
	
	@Column(nullable=false)
	private String subject;

	
	/* The EmailID coulmn should not be null and must be unique. */
	@Column(nullable=false,unique=true)
	private String email;
	
	/* The PhoneNo coulmn should not be null and must be unique. */
	@Column(nullable=false,unique=true,length=10)
	private String phone_no;
	
	/* The Address coulmn should not be null. */
	@Column(nullable=false)
	private String address;
	
	/* The password coulmn should not be null and must be unique. */
	@Column(nullable=false,unique=true)
	private String password;
	
	/*This is security pin column*/
	@Column(nullable=false)
	private String securitypin;
	
	/* Default constructor with no fields */
	public TeacherRegistration() {
		
	}

	/* Constructor with all the fields */
	

	/* Getter & Setter method for iD */
	public long getID() {
		return ID;
	}
	


	public TeacherRegistration(long iD, String first_Name, String last_Name, String subject, String email,
			String phone_no, String address, String password) {
		super();
		this.ID = iD;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.subject = subject;
		this.email = email;
		this.phone_no = phone_no;
		this.address = address;
		this.password = password;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	/* Getter & Setter method for First_Name */
	public String getFirst_Name() {
		return first_Name;
	}


	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	/* Getter & Setter method for Last_Name */
	public String getLast_Name() {
		return last_Name;
	}


	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	
	
	/* Getter & Setter method for Subject */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	/* Getter & Setter method for Subject */
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	/* Getter & Setter method for Phone_no */
	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	/* Getter & Setter method for address */
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	/* Getter & Setter method for password */
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	/* Getter & Setter method for securitypin*/
	public String getSecuritypin() {
		return securitypin;
	}

	public void setSecuritypin(String securitypin) {
		this.securitypin = securitypin;
	}
	
	
	



	
	

	

	
	
	
}

