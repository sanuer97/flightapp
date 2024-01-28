package com.psa.flight_reservation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class User extends AbstractEntity {
	
	@Column(name="first_Name", nullable=false,length=128,unique=false)
	private String firstName;
	@Column(name="last_Name", nullable=false,length=128,unique=false)
	private String lastName;
	@Column(name="email", nullable=false,length=128,unique=true)
	private String email;
	@Column(name="password", nullable=false,length=128,unique=true)
	private String password;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
