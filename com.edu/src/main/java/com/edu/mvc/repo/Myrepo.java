package com.edu.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.mvc.entities.Student;

@Repository
public interface Myrepo extends JpaRepository<Student, Integer>{

}
