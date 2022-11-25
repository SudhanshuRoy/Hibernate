package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Employee emp1=new Employee();
		emp1.setName("Amit");
		emp1.setSalary(9500);
		
		Employee emp2=new Employee();
		emp2.setName("suresh");
		emp2.setSalary(7800);
		
		Department dept=new Department();
		
		dept.setDname("Development");
		dept.setLocation("Delhi");

		//associating both employee with a  dept obj	
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		
		
		
		em.getTransaction().begin();
		
//		em.persist(emp1);
//		em.persist(emp2);
		em.persist(dept);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done...");

	}

}
