package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(employee);
		
		em.getTransaction().commit();
		
		if(employee==null)
		throw new EmployeeException("Employee couldn't inserted !");
		else System.out.println("Employee inserted successfully!");
		em.close();
		

		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp=null;
		EntityManager em=EMUtil.provideEntityManager();
		emp= em.find(Employee.class, empId);
		if(emp==null) throw new EmployeeException("Invalid Employee Id");
		em.close();
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee emp=null;
		EntityManager em=EMUtil.provideEntityManager();
		emp= em.find(Employee.class, empId);
		if(emp!=null)
		{
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
		}
			
		else
		throw new EmployeeException("Invalid Employee Id");
		em.close();
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Employee emp=null;
		EntityManager em=EMUtil.provideEntityManager();
		emp= em.find(Employee.class, employee.getEmpId());
		if(emp!=null)
		{
			em.getTransaction().begin();
			emp.setName(employee.getName());
			emp.setAddress(employee.getAddress());
			emp.setSalary(employee.getSalary());
			em.getTransaction().commit();
		}
			
		else
		throw new EmployeeException("Invalid Employee Id");
		em.close();
		return emp;
	}

}
