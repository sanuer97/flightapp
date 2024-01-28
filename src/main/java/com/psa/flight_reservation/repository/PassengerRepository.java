package com.psa.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight_reservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
