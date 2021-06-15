package com.annydeveloper.springRest.service;

import java.util.List;

import com.annydeveloper.springRest.entities.Courses;

public interface courseService {

	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses course);
	
	public Courses updateCourse(Courses course);
	
	public void  deleteCourse(long courseId);


}
