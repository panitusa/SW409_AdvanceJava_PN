package com.sw409.BlackBoard.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.BlackBoard.models.Course;
import com.sw409.BlackBoard.repositories.BlackBoardRepository;

@Service
public class BlackBoardService {

	@Autowired
	BlackBoardRepository blackboardRepository;
	
	public ArrayList<Course> getAllCourses(){
		return (ArrayList<Course>) blackboardRepository.findAll();
		
	}
}
