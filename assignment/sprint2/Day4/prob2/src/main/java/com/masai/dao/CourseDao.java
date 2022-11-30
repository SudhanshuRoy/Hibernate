package com.masai.dao;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;

public interface CourseDao {
	
	public boolean createCourse(Course course) throws CourseException;
	public boolean assignCourseToStudent(int sid,int cid) throws CourseException,StudentException; 

}
