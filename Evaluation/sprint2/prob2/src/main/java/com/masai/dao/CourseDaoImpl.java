package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.internal.build.AllowSysOut;

import com.masai.exception.CourseException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public void addCourse(Course course) {
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void getCourse(int course_id) throws CourseException {
		
		EntityManager em=EMUtil.provideEntityManager();
		Course course=em.find(Course.class, course_id);
		if(course!=null)
		{
			System.out.println("Course Name :"+course.getCourseName());
			System.out.println("Course Duration :"+course.getDuration());
			System.out.println("Course Fee:"+course.getFee());
			List<Student> students=course.getStudents();
			students.forEach(s->{
				System.out.println("Student roll : "+s.getRollNo());
				System.out.println("Student name : "+s.getName());
				System.out.println("Student mobile : "+s.getMobile());
				System.out.println("Student email : "+s.getEmail());
				System.out.println("************************");
				
			});
		}else throw new CourseException("Invalid course Id : ");
		
	}

}
