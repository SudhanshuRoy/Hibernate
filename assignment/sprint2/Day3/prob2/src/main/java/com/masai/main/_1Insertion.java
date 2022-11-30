package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Customer;
import com.masai.utility.EMUtil;

public class _1Insertion {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Customer c1=new Customer();
		Customer c2=new Customer();
		Address add1=new Address("Bihar","Muz","844112","home");
		
		Address add2=new Address("Haryana","Gurgon","122017","office");
		
		c1.setName("Sudhanshu");
		c1.setMobileNumber("7979099677");
		c1.setEmail("s@gmail.com");
		c1.getAddresses().add(add1);
		c1.getAddresses().add(add2);
		
		c2.setName("Raj");
		c2.setMobileNumber("7899099677");
		c2.setEmail("r@gmail.com");
		c2.getAddresses().add(add1);
		c2.getAddresses().add(add2);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
		System.out.println("done..");
		
		

	}

}
