package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user-phone");
		EntityManager em=emf.createEntityManager();
		
		Student student =new Student();
		student.setName("Sudhanshu");
		student.setRollNumber(12);
		
		College college=new College();
		college.setCid(1);
		college.getStudents().add(student);
		student.setCollege(college);
		
		em.getTransaction().begin();
		em.persist(college);
		em.getTransaction().commit();
		em.close();
		System.out.println("done..");
		

	}

}
