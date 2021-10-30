package com.dd.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dd.springrest.bean.Course;
import com.dd.springrest.service.CourseService;

@RestController
public class SpringController {
	@Autowired
	CourseService service;
	
	//For testing
	@GetMapping("/home")
	public String home() {
		return "Welcome to Spring Boot Demo App";
	}
	
	//Get all courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.service.getCourses();
	}
	
	//Get a particular course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.service.getCourse(Long.parseLong(courseId));
	}
	
	//Add a course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourse(course);
	}
	
	//Update a course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.service.updateCourse(course);
	}
	
	//Delete a course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.service.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
