package com.registration.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
