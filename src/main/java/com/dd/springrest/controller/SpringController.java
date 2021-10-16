package com.dd.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dd.springrest.bean.Course;
import com.dd.springrest.service.CourseService;

@RestController
public class SpringController {
	@Autowired
	CourseService service;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Spring Boot Demo App";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.service.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.service.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("courses")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourse(course);
	}
}
