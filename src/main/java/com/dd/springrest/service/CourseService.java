package com.dd.springrest.service;

import java.util.List;

import com.dd.springrest.bean.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}
