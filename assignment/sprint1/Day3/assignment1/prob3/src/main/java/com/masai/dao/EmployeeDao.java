package com.masai.dao;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeDao {
	public void save(Employee emp) throws EmployeeException;
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
}
