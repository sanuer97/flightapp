package com.psa.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.psa.flight_reservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
         @Query()
         User findByEmail(String email);

}
