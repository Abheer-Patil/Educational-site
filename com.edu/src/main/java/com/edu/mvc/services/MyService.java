package com.edu.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mvc.entities.Student;
import com.edu.mvc.repo.Myrepo;

@Service
public class MyService {

	@Autowired
	private Myrepo myrepo;
	
	public Student tosave(Student student)
	{
		return myrepo.save(student);
	}
	
}
