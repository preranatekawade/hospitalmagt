package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Patient;
import com.example.demo.repository.patrepo;

public class PatientService {
	
	@Autowired
	patrepo pr;
	
	public void savepatient(Patient p) {
		
		pr.save(p);
		
	}
	public void delpatient(int Pid) {
		
		pr.deleteById(Pid);
	}
	public Patient getpatient(int Pid) {
		
		return pr.findById(Pid).get();
	}
	public void delalldoctor() {
		
		 pr.deleteAll();
	}


}
