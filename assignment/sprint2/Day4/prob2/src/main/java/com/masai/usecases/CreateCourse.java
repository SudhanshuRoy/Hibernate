package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exception.CourseException;
import com.masai.model.Course;

public class CreateCourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name : ");
		String  cname=sc.next();
		System.out.println("Enter Instructor name : ");
		String ins=sc.next();
		
		Course course=new Course();
		course.setCname(cname);
		course.setIntructor(ins);
		CourseDao dao=new CourseDaoImpl();
		try {
		boolean flag=dao.createCourse(course);
		if(flag) System.out.println("Course created successfully !");
		} catch (CourseException e) {
			
			e.printStackTrace();
		}

	}

}
