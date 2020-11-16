package com.balaji.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.balaji.model.Student;
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void add(Student student) {
		hibernateTemplate.save(student);
		
	}

}
