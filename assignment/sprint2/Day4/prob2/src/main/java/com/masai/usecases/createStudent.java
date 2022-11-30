package com.masai.usecases;

import java.time.LocalDate;
import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class createStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name : ");
		String name=sc.next();
		System.out.println("Enter mobile number : ");
		String phone=sc.next();
		System.out.println("Enter student DOB");
		System.out.println("Enter  Year : ");
		int year=sc.nextInt();
		System.out.println("Enter  month(ex:8 or 9 : ");
		int month=sc.nextInt();
		
		System.out.println("Enter  day : ");
		int day=sc.nextInt();
		
		Student student=new Student();
		student.setSname(name);
		student.setPhone(phone);
		student.setDOB(LocalDate.of(year, month, day));
		
		StudentDao dao=new StudentDaoImpl();
		try {
			boolean flag=dao.createStudent(student);
			if(flag) System.out.println("student inserted successfully !");
		} catch (StudentException e) {
			
			e.printStackTrace();
		}
	}

}
