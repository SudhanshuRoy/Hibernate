package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		List<Employee> employees=new ArrayList<>();
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from Employee";
		TypedQuery<Employee> tq=em.createQuery(jpql,Employee.class);
		employees=tq.getResultList();
		 if(employees.isEmpty())  throw new EmployeeException("Table is Empty!");
		 em.close();
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		
		List<Employee> employees=new ArrayList<>();
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from Employee where address=:add";
		TypedQuery<Employee> tq=em.createQuery(jpql,Employee.class);
		tq.setParameter("add", address);
		employees=tq.getResultList();
		 if(employees.isEmpty())  throw new EmployeeException("Table is Empty!");
		 em.close();
		return employees;
	}

}
