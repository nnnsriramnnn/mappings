package com.cst.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cst.map.entity.Student;
import com.cst.map.repository.StudentRepo;
import com.cst.map.service.RegistrationService;

@RestController
@RequestMapping("/register")
public class RegistrationControl {

	@Autowired
	StudentRepo srepo;
	
	@Autowired
	RegistrationService service;
	
	@PostMapping("/save")
	public String save(@RequestBody Student student) {
		
		service.saveRegistration(student);
		
		return "success";
	}
	
	@GetMapping("/view")
	public List<Student> view() {
		
		List<Student> student = srepo.findAll();
		
		return student;
	}
	
}
