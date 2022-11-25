package com.masai.lazyloading;

import javax.persistence.EntityManager;

import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class _1Demo {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Employee emp=em.find(Employee.class, 1);
		em.close();
//		System.out.println(emp);
		emp.getEid();emp.getName();emp.getSalary();
		System.out.println(emp.getAddresses());
		
		

	}

}
