package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
     EntityManagerFactory emf=  Persistence.createEntityManagerFactory("studentUnit");
     EntityManager em= emf.createEntityManager();
     // DRL Operation get the data
     Student student=em.find(Student.class, 30);
     if(student!=null) 
     System.out.println(student); 
     else System.out.println("Record not found");
     
     // DML Operation insert data
     
//     Student s2=new Student(40,"GhanShyam",550);
     Student s=new Student();
     s.setName("Sudhanshu");
     s.setMarks(650);
     EntityTransaction et= em.getTransaction();
     et.begin();
     em.persist(s);
     et.commit();
     System.out.println("Object saved...");
     
     em.close();

	}
	

}
