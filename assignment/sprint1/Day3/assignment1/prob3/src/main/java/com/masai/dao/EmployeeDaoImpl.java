package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void save(Employee emp)throws EmployeeException {
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Employee saved!");
		em.close();
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException{
		Employee emp=null;
		EntityManager em=EMUtil.provideEntityManager();
		Employee employee=em.find(Employee.class, empId);
		if(employee!=null) {
			emp=employee;
		}else throw new EmployeeException("Invalid empId");
		em.close();
		return emp;
	}

	

	

}
