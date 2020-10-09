package com.sw409.BlackBoard.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.BlackBoard.models.Course;
import com.sw409.BlackBoard.services.BlackBoardService;


@RestController
@CrossOrigin("*")
public class BlackBoardController {
	@Autowired
	
	BlackBoardService blackboardService;
	@GetMapping("api/courses")
	public ArrayList<Course> getAllCourse(){
		return blackboardService.getAllCourses();
		
	}

}
