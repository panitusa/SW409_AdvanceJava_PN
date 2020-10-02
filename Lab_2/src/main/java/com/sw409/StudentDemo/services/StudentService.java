package com.sw409.StudentDemo.services;

import java.util.ArrayList;
import java.util.List;

import com.sw409.StudentDemo.models.Student;

public class StudentService {
	
	List<Student> studentList = new ArrayList<>();
	
	//create
	public Student createStudent(Student student) 
	{
		studentList.add(student);
		return student;
		
	}
	
	//read 
	public List<Student> findAllStudents()
	{
		return studentList;
	}
	
	//update
	public void updateStudent(Integer id, Student s) 
	{
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) 
			{
				studentList.set(i, s);
			}
			
		}
	}
	
	//Delete
	public void deleteStudent(Integer id, Student s) 
	{
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) 
			{
				studentList.remove(i);
			}
			
			
		}
	}
}
