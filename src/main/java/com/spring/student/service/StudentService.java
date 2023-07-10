package com.spring.student.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.student.model.Student;
import com.spring.student.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired(required=true)
	
	public StudentRepository studentRepository ;
	
	//getting all student information
	public List<Student> getStudentsAll()
	{
		List<Student> student = new ArrayList<Student>();
		    studentRepository.findAll().forEach(students ->student.add(students));
		return student;
	}
	
	
	//get student information by id
	public Student studentsById(int id)
	{
		return studentRepository.findById(id).get();
	}
	
	
	//saving the student information
	public Student saveOrUpdate(Student student)
	{
		return studentRepository.save(student);
	}
	
	
	//delete the student information by id
	public void deleteById(int id)
	{
		studentRepository.deleteById(id);
	}
	
	
	//updating the student information by id
	public void update(Student student, int id)
	{
		studentRepository.save(student);
	}
	
}
