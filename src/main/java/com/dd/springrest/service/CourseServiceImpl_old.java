package com.dd.springrest.service;

/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dd.springrest.bean.Course;*/

//@Service
public class CourseServiceImpl_old /* implements CourseService */ {
	/*
	 * List<Course> courses;
	 * 
	 * 
	 * public CourseServiceImpl_old() { super(); courses = new ArrayList<Course>();
	 * courses.add(new Course(1,"Spring","Covers basics of Spring framework"));
	 * courses.add(new Course(2,"JAVA","Covers basics of JAVA J2SE")); }
	 * 
	 * 
	 * @Override public List<Course> getCourses() {
	 *//**
		 * Return a list of courses
		 */
	/*
	 * return this.courses; }
	 * 
	 * 
	 * @Override public Course getCourse(long courseId) {
	 *//**
		 * Takes courseId as parameter and returns a course object corresponding to that
		 * id
		 */
	/*
	 * Course c = null; for(Course course: this.courses)
	 * if(courseId==course.getId()) c = course; return c; }
	 * 
	 * 
	 * @Override public Course addCourse(Course course) {
	 *//**
		 * Adds a new course to the list of Courses
		 */
	/*
	 * this.courses.add(course); return course; }
	 * 
	 * 
	 * @Override public Course updateCourse(Course course) {
	 *//**
		 * Takes a course objects as input and replaces the existing object with the new
		 * one
		 */
	/*
	 * boolean flag = false; for(Course c:this.courses) {
	 * if(c.getId()==course.getId()) { c.setDescription(course.getDescription());
	 * c.setName(course.getName()); flag = true; } } return flag==true?course:null;
	 * }
	 * 
	 * 
	 * @Override public void deleteCourse(long courseId) {
	 *//**
		 * Takes courseId as an argument and deletes a course associated to that Id
		 *//*
			 * Course c; Iterator<Course> iterator = this.courses.iterator();
			 * while(iterator.hasNext()) { c = iterator.next(); if(c.getId()==courseId) {
			 * iterator.remove(); } } }
			 */
}
