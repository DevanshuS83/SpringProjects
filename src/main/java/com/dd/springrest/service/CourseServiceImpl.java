package com.dd.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dd.springrest.bean.Course;
@Service
public class CourseServiceImpl implements CourseService {

	List<Course> courses;
	
	
	public CourseServiceImpl() {
		super();
		courses = new ArrayList<Course>();
		courses.add(new Course(1,"Spring","Covers basics of Spring framework"));
		courses.add(new Course(2,"JAVA","Covers basics of JAVA J2SE"));
	}


	@Override
	public List<Course> getCourses() {
		/**
		 * Return a list of courses
		 */
		return this.courses;
	}


	@Override
	public Course getCourse(long courseId) {
		/**
		 * Takes courseId as parameter and returns
		 * a course object corresponding to that id
		 */
		Course c = null;
		for(Course course: this.courses)
			if(courseId==course.getId())
				c = course;
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		/**
		 * Adds a new course to the list of
		 * Courses
		 */
		this.courses.add(course);
		return course;
	}

}
