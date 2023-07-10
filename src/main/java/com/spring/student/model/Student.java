package com.spring.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="stud")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Qualification")
	private String qualification;
	
	@Column(name="Age")
	private double age;
	
	@Column(name="Percentage")
	private double percentage;
	
	
	
	
	public Student(int id, String name, String qualification, double age, double percentage) 
	{
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.age = age;
		this.percentage = percentage;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	
	public double getAge() 
	{
		return age;
	}
	public void setAge(double age) 
	{
		this.age = age;
	}
	
	public double getPercentage() 
	{
		return percentage;
	}
	public void setPercentage(double percentage) 
	{
		this.percentage = percentage;
	}
	
	

}
