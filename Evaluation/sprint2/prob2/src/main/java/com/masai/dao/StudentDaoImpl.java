package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class StudentDaoImpl implements StudentDao  {

	@Override
	public void getStudent(int roll_no) throws StudentException {
		
		EntityManager em=EMUtil.provideEntityManager();
		Student student=em.find(Student.class,roll_no);
		if(student!=null)
		{
			System.out.println("Name : "+student.getName());
			System.out.println("Email : "+student.getEmail());
			System.out.println("Mobile : "+student.getMobile());
			
			Course course=student.getCourse();
			System.out.println("Course Name : "+course.getCourseName());
			System.out.println("Course Duration : "+course.getDuration());
			System.out.println("Course Fee : "+course.getFee());
				
		}else throw new StudentException("Invalid Student Roll");
		
	}

}
