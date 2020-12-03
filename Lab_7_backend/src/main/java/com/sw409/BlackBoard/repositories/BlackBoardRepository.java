package com.sw409.BlackBoard.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sw409.BlackBoard.models.Course;

public interface BlackBoardRepository extends CrudRepository<Course, Integer> {


}
