package com.edu.mvc.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CollectionType;
import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name = "Student_info")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String mail;
	private int age;
	private long num;
	
	@Convert(converter = ListToStringConverter.class)
	private ArrayList<String> courses;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = (ArrayList<String>) courses;
	}

	public Student(int id,String name, String mail, int age, long num, ArrayList<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.age = age;
		this.num = num;
		this.courses = (ArrayList<String>) courses;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mail=" + mail + ", age=" + age + ", num=" + num
				+ ", courses=" + courses + "]";
	}

	

}
