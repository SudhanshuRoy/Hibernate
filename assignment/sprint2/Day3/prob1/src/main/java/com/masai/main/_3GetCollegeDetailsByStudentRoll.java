package com.masai.main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.model.College;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class _3GetCollegeDetailsByStudentRoll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student roll for college details");
		int roll=sc.nextInt();
		
		EntityManager em=EMUtil.provideEntityManager();
		Student student=em.find(Student.class, roll);
		College college=student.getCollege();
		System.out.println("College name : "+college.getCollegeName());
		System.out.println("College addres : "+college.getCollegeAddress());
		

	}

}
