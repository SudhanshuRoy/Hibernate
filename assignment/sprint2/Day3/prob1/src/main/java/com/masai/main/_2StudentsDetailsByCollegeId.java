package com.masai.main;

import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;



import com.masai.model.College;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class _2StudentsDetailsByCollegeId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college Id for Student details : ");
		int cid=sc.nextInt();
		
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from College where collegeId=:cid";
		TypedQuery<College> q=em.createQuery(jpql,College.class);
		q.setParameter("cid",cid);
		College college=q.getSingleResult();
		
		Set<Student> students=college.getStudents();
		
		for(Student s:students) System.out.println(s);
		System.out.println("done..");
		
		
	  

	}

}
