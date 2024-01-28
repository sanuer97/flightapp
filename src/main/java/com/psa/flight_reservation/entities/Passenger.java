package com.psa.flight_reservation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class Passenger extends AbstractEntity {
	
	@Column(name="first_Name", nullable=false,length=128,unique=false)
	private String firstName;
	@Column(name="last_Name", nullable=false,length=128,unique=false)
	private String lastName;
	@Column(name="middle_Name", nullable=false,length=128,unique=false)
	private String middleName;
	@Column(name="email", nullable=false,length=128,unique=false)
	private String email;
	@Column(name="phone", nullable=false,length=128,unique=false)
	private String phone;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
