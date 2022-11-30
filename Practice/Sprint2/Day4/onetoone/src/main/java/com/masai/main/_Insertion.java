package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class _Insertion {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
		Department d1=new Department();
		d1.setDname("Sales");
		d1.setLocation("kolkata");
	
		
		Employee emp = new Employee();
		emp.setName("Ram");
		emp.setSalary(8500);
		emp.setDept(d1);
		
		d1.setEmp(emp);
		
		em.getTransaction().begin();
		
		em.persist(d1);
		
		em.getTransaction().commit();
		em.close();
		System.out.println("done..");


	}

}
