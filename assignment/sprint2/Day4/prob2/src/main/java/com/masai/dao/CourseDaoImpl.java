package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class CourseDaoImpl implements CourseDao{

	@Override
	public boolean createCourse(Course course) throws CourseException {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		flag=true;
		
		if(flag==false) throw new CourseException("Cration failed 1");
		em.close();
		return flag;
	}

	@Override
	public boolean assignCourseToStudent(int sid,int cid) throws CourseException, StudentException {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		Student student=em.find(Student.class, sid);
		if(student!=null)
		{
			Course course=em.find(Course.class, cid);
			if(course!=null)
			{
				em.getTransaction().begin();
				student.getCourses().add(course);
				course.getStudents().add(student);
				flag=true;
				em.getTransaction().commit();
			}
			else
			{
				throw new CourseException("Invalid Course Id");
			}
		}
		else 
		{
			throw new StudentException("Invalid Student Id");
		}
		if(flag==false)System.out.println("Course Assignment Failed !");
		em.close();
		return flag;
	}

}
