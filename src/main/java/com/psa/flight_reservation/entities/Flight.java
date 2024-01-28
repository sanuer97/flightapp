package com.psa.flight_reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
public class Flight extends AbstractEntity {
	
	@Column(name="flight_Number", nullable=false,length=128,unique=false)
	private String flightNumber;
	@Column(name="operation_Airlines", nullable=false,length=128,unique=false)
	private String operationAirlines;
	@Column(name="departure_City", nullable=false,length=128,unique=false)
	private String departureCity;
	@Column(name="arrival_City", nullable=false,length=128,unique=false)
	private String arrivalCity;
	@Column( nullable=false,length=128,unique=false)
	private Date dateOfDeparture;
	@Column( name="estimated_Departure_Time", nullable=false,length=128,unique=false)
	private
	 Timestamp estimatedDepartureTime;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperationAirlines() {
		return operationAirlines;
	}
	public void setOperationAirlines(String operationAirlines) {
		this.operationAirlines = operationAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	

}
