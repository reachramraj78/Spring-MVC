package com.balaji.dao;

import java.util.List;

import com.balaji.model.Student;

public interface StudentDAO {
	public void add(Student student);

	public List<Student> findAll();

	public void deleteById(Integer id);
}
