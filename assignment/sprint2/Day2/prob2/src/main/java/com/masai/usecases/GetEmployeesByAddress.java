package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class GetEmployeesByAddress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter address for get the employee");
		String add=sc.next();
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			List<Employee> employees=dao.getEmployeesByAddress(add);
			System.out.println(employees);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}

	}

}
