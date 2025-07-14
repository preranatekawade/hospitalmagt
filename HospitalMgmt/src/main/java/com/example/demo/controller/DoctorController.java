package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorService ds;
	
	@PostMapping("doctor")
	String adddoctor(@RequestBody Doctor d) {
		
		ds.savedoctor(d);
		
		return "doctor Addded to Controller class";
	}
		@GetMapping("doctor")
		String getdoctor(@PathVariable int Did) {
			
			ds.getdoctor(Did);
		}
	}
}
