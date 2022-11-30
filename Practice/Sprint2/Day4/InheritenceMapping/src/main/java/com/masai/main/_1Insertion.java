package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.ContractualEmployee;
import com.masai.entities.Employee;
import com.masai.entities.SalaryEmployee;
import com.masai.utility.EMUtil;

public class _1Insertion {
	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Employee emp=new Employee();
		emp.setName("Ram");
		
		
		SalaryEmployee semp=new SalaryEmployee();
		semp.setName("Mohan");
		semp.setSalary(85000);
		
		ContractualEmployee cemp=new ContractualEmployee();
		cemp.setName("Hari");
		cemp.setCostPerDay(3000);
		cemp.setNoOfWorkingDays(10);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(semp);
		em.persist(cemp);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("done");

		
	}

}
