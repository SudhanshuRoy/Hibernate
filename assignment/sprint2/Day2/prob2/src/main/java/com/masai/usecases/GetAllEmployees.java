package com.masai.usecases;

import java.util.List;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class GetAllEmployees {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			List<Employee> employees=dao.getAllEmployees();
			System.out.println(employees);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}

	}

}
