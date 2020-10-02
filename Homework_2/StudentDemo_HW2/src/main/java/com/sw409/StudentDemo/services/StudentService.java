package com.sw409.StudentDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.StudentDemo.models.Student;
import com.sw409.StudentDemo.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	//List<Student> studentList = new ArrayList<>();
	
	//create
	public Student createStudent(Student student) 
	{
		studentRepository.save(student);
		//studentList.add(student);
		return student;
		
	}
	
	//read 
	public List<Student> findAllStudents()
	{

		return (List<Student>) studentRepository.findAll();
	}
	
	//update
	public void updateStudent(Integer id, Student s) 
	{
		studentRepository.save(s);	
	}
	
	//Delete
	public void deleteStudent(Integer id, Student s) 
	{

		studentRepository.deleteById(id);
	}
}
