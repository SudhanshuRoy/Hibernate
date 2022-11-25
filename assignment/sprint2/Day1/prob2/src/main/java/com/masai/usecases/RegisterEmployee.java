package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name : ");
		String name=sc.next();
		System.out.println("Enter address : ");
		String address=sc.next();
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		Employee emp=new Employee();
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(salary);
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			Employee employee=dao.registerEmployee(emp);
			System.out.println(employee);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
