package com.dd.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dd.springrest.bean.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
