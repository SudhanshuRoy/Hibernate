package com.masai.model;

import com.masai.utility.EMUtil;
import javax.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEntityManager();
		Employee emp=new Employee();
		Address address=new Address("Bihar","Muzaffarpur","844112","Home");
		Address address2=new Address("Haryana","Gurugram","122017","Office");
		
		emp.setName("Sudhanshu");
		emp.setSalary(200000);
		
		emp.getAddresses().add(address);
		emp.getAddresses().add(address2);
		
		em.getTransaction().begin();
		em.persist(emp);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("done..");

	}

}
