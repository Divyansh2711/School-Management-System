package com.SchoolManagementSystem.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class StudentRegistration {
	/*
	 * ID is set as primary key and its value will be automatically generated by
	 * database
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;
	
	
	/* The firstName column should not be null. */
	@Column(nullable=false)
	private String first_Name;
	
	/* The LastName coulmn should not be null. */
	@Column(nullable=false)
	private String last_Name;
	

	
	/* The EmailID coulmn should not be null and must be unique. */
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable = false)
	private String gender;
	
	/* The PhoneNo coulmn should not be null and must be unique. */
	@Column(nullable=false,unique=true,length=10)
	private String phone_no;
	
	/* The Address coulmn should not be null. */
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String city;
	
	@Column(nullable=false)
	private long pin;
	
	/* The password coulmn should not be null and must be unique. */
	@Column(nullable=false,unique=true)
	private String password;
	
	/*This is security pin column*/
	@Column(nullable=false)
	private String securitypin;
	
	private String grade;
	
	
	
	/* Constructor with all the fields */
	public StudentRegistration(long iD, String first_Name, String last_Name, String email, String gender,
			String phone_no, String address, String city, long pin, String password, String securitypin) {
		super();
		ID = iD;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.gender = gender;
		this.phone_no = phone_no;
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.password = password;
		this.securitypin = securitypin;
	}

	/* Getter & Setter method for iD */
	public long getID() {
		return ID;
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

	/* Getter & Setter method for Email ID */
	public String getEmail() {
		return email;
	}

	/* Getter & Setter method for Gender */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	
	/* Getter & Setter method for city */
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	/* Getter & Setter method for pin */
	public void setPin(long pin) {
		this.pin = pin;
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
	/* Getter & Setter method for security*/
	
	public String getSecuritypin() {
		return securitypin;
	}

	public void setSecuritypin(String securitypin) {
		this.securitypin = securitypin;
	}

	/* Default constructor with no fields */
	public StudentRegistration() {
		
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

	

	



	
	

	

	
	
	
}
