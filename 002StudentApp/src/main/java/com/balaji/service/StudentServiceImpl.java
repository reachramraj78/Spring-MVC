package com.balaji.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balaji.dao.StudentDAO;
import com.balaji.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO studentDAO;

	public void add(Student student) {
		studentDAO.add(student);
	}

}
