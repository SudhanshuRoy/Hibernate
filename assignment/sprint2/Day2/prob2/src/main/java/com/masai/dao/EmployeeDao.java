package com.masai.dao;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees() throws EmployeeException;
	public List<Employee> getEmployeesByAddress(String address) throws
	EmployeeException;

}
