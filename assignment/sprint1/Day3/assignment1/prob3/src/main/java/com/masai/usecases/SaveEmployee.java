package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name : ");
		String name=sc.next();
		System.out.println("Enter employee address : ");
		String address=sc.next();
		System.out.println("Enter employee salary : ");
		int salary=sc.nextInt();
		Employee emp=new Employee();
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(salary);
		
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			dao.save(emp);
		
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		

	}

}
