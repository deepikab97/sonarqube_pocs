package com.cybage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.entity.Student;
import com.cybage.repositary.StudentRepositary;

@Service
public class StudentService {

	@Autowired
	private StudentRepositary studentRepositary;
	
	
	public String saveStudent(Student student) {
		studentRepositary.save(student);
		return "Student information added successfully";
	}


	public List<Student> findAll() {
		
		return studentRepositary.findAll();
	}
	
	
	
	

}
