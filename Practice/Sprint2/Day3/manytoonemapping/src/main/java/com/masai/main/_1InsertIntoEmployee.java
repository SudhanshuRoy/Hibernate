package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class _1InsertIntoEmployee {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setDname("Sales");
		dept.setLocation("mumbai");
		
		Employee emp1=new Employee();
		emp1.setName("ram");
		emp1.setSalary(7800);
		emp1.setDept(dept);
		
		Employee emp2=new Employee();
		emp2.setName("ramesh");
		emp2.setSalary(8850);
		emp2.setDept(dept);
		
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		

	}

}
