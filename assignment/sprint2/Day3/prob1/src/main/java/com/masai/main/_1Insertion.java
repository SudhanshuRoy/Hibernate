package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.model.College;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class _1Insertion {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		College c1=new College();
		c1.setCollegeName("B.C.Roy");
		c1.setCollegeAddress("Durgapur");
		
		College c2=new College();
		c2.setCollegeName("RDS College");
		c2.setCollegeAddress("Muzaffarpur");
		
		Student s1=new Student();
		s1.setStudentName("Sudhanshu");
		s1.setMobileNumber("7979099677");
		s1.setEmail("s@gmail.com");
		
		s1.setCollege(c2);
		
		
		Student s2=new Student();
		s2.setStudentName("Raj");
		s2.setMobileNumber("7979045677");
		s2.setEmail("r@gmail.com");
		
		s2.setCollege(c2);
		
		Student s3=new Student();
		s3.setStudentName("Gaurav");
		s3.setMobileNumber("7979896377");
		s3.setEmail("g@gmail.com");
		
		s3.setCollege(c2);
		
		Student s4=new Student();
		s4.setStudentName("Pankaj");
		s4.setMobileNumber("8779045677");
		s4.setEmail("p@gmail.com");
		
		s4.setCollege(c2);
		
		Student s5=new Student();
		s5.setStudentName("Sudhanshu");
		s5.setMobileNumber("7979099677");
		s5.setEmail("s@gmail.com");
		s5.setCollege(c1);
		
		
		
		Student s6=new Student();
		s6.setStudentName("Raj");
		s6.setMobileNumber("7979045677");
		s6.setEmail("r@gmail.com");
		s6.setCollege(c1);
		
		
		Student s7=new Student();
		s7.setStudentName("Gaurav");
		s7.setMobileNumber("7979896377");
		s7.setEmail("g@gmail.com");
		s7.setCollege(c1);
		
		
		Student s8=new Student();
		s8.setStudentName("Pankaj");
		s8.setMobileNumber("8779045677");
		s8.setEmail("p@gmail.com");
		s8.setCollege(c1);
		
		
		c1.getStudents().add(s5);
		c1.getStudents().add(s6);
		c1.getStudents().add(s7);
		c1.getStudents().add(s8);
		
		c2.getStudents().add(s1);
		c2.getStudents().add(s2);
		c2.getStudents().add(s3);
		c2.getStudents().add(s4);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
		System.out.println("done..");

	}

}
