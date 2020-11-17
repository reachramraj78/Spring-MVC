package com.balaji.service;

import java.util.List;

import com.balaji.model.Student;

public interface StudentService {
	
	public void add(Student student);

	public List<Student> findAll();

	public void deleteById(Integer id);

}
