package com.registration.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.registration.student.dao.StudentDao;
import com.registration.student.dto.StudentResponse;
import com.registration.student.model.Student;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping(value="/student")
public class RegistrationController {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Integer updateStudent() {
		return null;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Integer addStudent() {
		return null;
	}
	
	@RequestMapping(value = "/delete/id", method = RequestMethod.DELETE)
	public void deleteStudent() {
		
	}
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public StudentResponse getStudentById(Integer id) {
		StudentResponse response = new StudentResponse();
		response.setId(1234567890);
		response.setFirstName("shashank");
		response.setLastName("kankanala");
		Student student = studentDao.getById(2);
		response.setId(student.getId());
		response.setFirstName(student.getFirstName());
		response.setLastName(student.getLastName());
		return response;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<StudentResponse> getAll() {
		return null;
		
	}
}
