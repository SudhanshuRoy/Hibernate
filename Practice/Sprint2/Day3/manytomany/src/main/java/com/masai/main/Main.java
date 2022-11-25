package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class Main {
	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Department d1 = new Department();
		d1.setDname("sales");
		d1.setLocation("kolkata");


		Department d2 = new Department();
		d2.setDname("Marketing");
		d2.setLocation("delhi");

		
		
		
		//creating employee without department
		Employee emp1 = new Employee();
		emp1.setName("ram");
		emp1.setSalary(50000);
		
		
		Employee emp2 = new Employee();
		emp2.setName("dinesh");
		emp2.setSalary(30000);
		
		//associating department with both employees(ram,dinesh) with dept sales
		emp1.getDepts().add(d1);
		emp2.getDepts().add(d1);
		
		//associating dept(sales) with both emp1 and emp2
		
		d1.getEmps().add(emp1);
		d1.getEmps().add(emp2);
		
		
		
		//assume dinesh is working in 2 dept(sales and marketing)
		emp2.getDepts().add(d2);
		d2.getEmps().add(emp2);
		
		
		
		em.getTransaction().begin();
		
		em.persist(d1);
		em.persist(d2);
		
		em.getTransaction().commit();

		System.out.println("done");
	}

}
