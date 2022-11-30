package com.masai.main;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;

public class GetStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll : ");
		int roll=sc.nextInt();
		
		StudentDao dao=new StudentDaoImpl();
		try {
			dao.getStudent(roll);
		} catch (StudentException e) {
			
			e.printStackTrace();
		}

	}

}
