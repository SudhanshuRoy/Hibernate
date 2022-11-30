package com.masai.main;

import java.util.Scanner;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.model.Course;
import com.masai.model.Student;

public class AddCourse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Course Name : ");
	String name=sc.next();
	System.out.println("Enter Course Duration : ");
	double duration=sc.nextDouble();
	System.out.println("Enter Course Fee : ");
	double fee=sc.nextDouble();
	
	System.out.println("Enter Student Name : ");
	String sname=sc.next();
	System.out.println("Enter Student Mobile : ");
	String smobile=sc.next();
	System.out.println("Enter Student Email : ");
	String semail=sc.next();
	
	
	Course course=new Course();
	course.setCourseName(name);
	course.setDuration(duration);
	course.setFee(fee);
	
	Student student=new Student();
	student.setName(sname);
	student.setMobile(smobile);
	student.setEmail(semail);
	student.setCourse(course);
	
	course.getStudents().add(student);
	CourseDao dao=new CourseDaoImpl();
	dao.addCourse(course);
	System.out.println("course get added with student");
	

	}

}
