package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class _2AddEmployeeInExistingDept {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Department dept= em.find(Department.class, 1);
		Employee emp=new Employee();
		emp.setName("Saurav");
		emp.setSalary(500000);
		
		em.getTransaction().begin();
		dept.getEmps().add(emp);
		em.getTransaction().commit();
		em.close();

	}

}
