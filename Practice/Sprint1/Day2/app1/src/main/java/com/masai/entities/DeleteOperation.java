package com.masai.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOperation {

	public static void main(String[] args) {	
	EntityManagerFactory emf =	Persistence.createEntityManagerFactory("studentUnit");
	EntityManager em= emf.createEntityManager();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter roll of student : ");
	int roll=sc.nextInt();
	
	Student student=em.find(Student.class, roll);
	
	// Delete student of particular marks
//	if(student != null) {
//	
//	 EntityTransaction et=em.getTransaction();
//	 et.begin();
//	 em.remove(student);
//	 et.commit();
//	 System.out.println("Sudent removed !");
//	}
//	else System.out.println("Student not fount !");
	
	if(student==null) {
		System.out.println("Student doesn't exist!!");
	}else {
		System.out.println("Enter grace marks you want to add : ");
		int marks=sc.nextInt();
		em.getTransaction().begin();
		student.setMarks(student.getMarks()+marks);
		em.getTransaction().commit();
	}
	em.close();
	System.out.println("done.... ");
	}

}
