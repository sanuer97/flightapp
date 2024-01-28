package com.psa.flight_reservation.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flight_reservation.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("depratureDate") @DateTimeFormat(pattern="MM-dd-YYYY") Date depratureDate) {
		flightRepo.findFlight(from,to,depratureDate);
		return "searchFlight";
	}

}
