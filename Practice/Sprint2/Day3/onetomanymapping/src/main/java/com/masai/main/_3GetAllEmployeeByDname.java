package com.masai.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Employee;
import com.masai.utility.EMUtil;


public class _3GetAllEmployeeByDname {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
		// emps is valriable in Departmant class not column in department table;
		// Internally using InnerJoin to provide you result
		
		String jpql="Select emps from Department where dname=:dep";
		Query q= em.createQuery(jpql);
		q.setParameter("dep", "Development");
		List<Employee> emps=q.getResultList();
		for(Employee e:emps)System.out.println(e);
		em.close();

	}

}
