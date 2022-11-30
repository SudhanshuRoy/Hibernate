package com.masai.dao;

import com.masai.exception.CourseException;
import com.masai.model.Course;

public interface CourseDao {
	
	public void addCourse(Course course);
	public void getCourse(int course_id) throws CourseException;

}
