package com.psa.flight_reservation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flight_reservation.entities.User;
import com.psa.flight_reservation.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
//	@RequestMapping( value ="/saveReg", method= RequestMethod.POST)
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute User user,ModelMap model	) {
		userRepo.save(user);
		model.addAttribute("msg", "Successfully Registed");
		return "login/showReg";
	}
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login/login";
		
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap map) {
		try {
		User user=userRepo.findByEmail(email);
		if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
			return "searchFlight";
		}else {
			map.addAttribute("msg","invalid user name password");
			return "login/login";
		}
	}catch(Exception e) {
		
		map.addAttribute("msg","invalid user name password");
		return "login/login";
	}

	}
}
