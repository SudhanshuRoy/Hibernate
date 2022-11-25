package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Employee emp=new Employee();
		Address add1=new Address("Bihar","Muzaffarpur","844112","Home");
		Address add2=new Address("Hariyana","Gurgon","122017","Office");
		emp.setName("Sudhanshu");
		emp.setGender("Male");
		emp.setSalary(200000);
		emp.getAddress().add(add1);
		emp.getAddress().add(add2);
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		



	}

}
