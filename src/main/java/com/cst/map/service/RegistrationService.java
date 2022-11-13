package com.cst.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cst.map.entity.Student;
import com.cst.map.repository.StudentRepo;

@Service
public class RegistrationService {
	
	@Autowired
	StudentRepo srepo;
	
	public void saveRegistration(Student student) {
		
		srepo.save(student);
		
	}
	
}
