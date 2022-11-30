package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;

public class AssignCourseToStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int sid=sc.nextInt();
		System.out.println("Enter Course Id : ");
		int cid=sc.nextInt();
		
		CourseDao dao=new CourseDaoImpl();
		try {
		boolean flag=	dao.assignCourseToStudent(sid, cid);
		if(flag)System.out.println(" Assignment successfull !");
		} catch (CourseException e) {
			
			e.printStackTrace();
		} catch (StudentException e) {
			
			e.printStackTrace();
		}
	}

}
