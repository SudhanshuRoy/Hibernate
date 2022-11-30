package com.masai.main;

import java.util.Scanner;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exception.CourseException;

public class GetCourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course Id : ");
		int courseId=sc.nextInt();
		CourseDao dao=new CourseDaoImpl();
		try {
			dao.getCourse(courseId);
		} catch (CourseException e) {
			
			e.printStackTrace();
		}

	}

}
