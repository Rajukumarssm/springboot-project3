package com.learnSBThymeleaf.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dc")
public class Datacontroller {
	
	@PostMapping
	public String acceptdata(@RequestParam String data) {
//		@requestparam is used when take user form data as input i.e hold form data
		return ("data entered is : "+data);
	}

}
