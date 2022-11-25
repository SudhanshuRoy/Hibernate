package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class _1Insertion {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setDname("Marketing");
		dept.setLocation("Kolkata");
		
		Employee emp1=new Employee();
		emp1.setName("Sunil");
		emp1.setSalary(7800);
		emp1.setDept(dept); //associating dept with emp1
		
		Employee emp2=new Employee();
		emp2.setName("Suresh");
		emp2.setSalary(8800);
		emp2.setDept(dept);  //associating dept with emp1
		
		//here both emp got the dept details..
		
		//now we need to give both emp details to the dept
		//associating both emp with the dept
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();	
			
		System.out.println("done...");

	}

}
