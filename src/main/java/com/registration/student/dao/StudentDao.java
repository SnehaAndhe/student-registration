package com.registration.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.registration.student.model.Student;
import com.registration.student.repository.StudentRepository;

@Component
@Transactional(rollbackFor = {Exception.class})
public class StudentDao {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public Student getById(Integer id) {
		return studentRepo.getOne(id);
	}
	
	public void delete(Integer id) {
		  studentRepo.delete(id);
	}
	
	public Student insert(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getAll(){
		return studentRepo.findAll();
	}

}
