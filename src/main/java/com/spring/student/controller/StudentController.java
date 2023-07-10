package com.spring.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student.model.Student;

import com.spring.student.service.StudentService;
@RestController

public class StudentController 
{
	@Autowired(required=true)
	
	private StudentService studentService;
	
	/*@Autowired
	public StudentController(StudentService studentService) 
	{
		this.studentService = studentService;
	}*/
	
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		return studentService.getStudentsAll();
	} 
	
	

	@GetMapping("/student/{id}")
	public Student studentById(@PathVariable("id")int id)
	{
		return studentService.studentsById(id);
	}
	
	@PostMapping("/students")
	public int saveTheStudent(@RequestBody Student student)
	{
		studentService.saveOrUpdate(student);
		return student.getId();
	   
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(int id)
	{
		studentService.deleteById(id);
		return "deleted successfully";
	}
	
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student student ,int id)
	{
		studentService.update(student,id);
		return "updated successfully";
	}

}
