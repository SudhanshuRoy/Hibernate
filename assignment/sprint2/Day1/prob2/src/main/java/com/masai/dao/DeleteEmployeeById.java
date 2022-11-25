package com.masai.dao;

import java.util.Scanner;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class DeleteEmployeeById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id for employee details");
		int empid=sc.nextInt();
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			Employee emp=dao.deleteEmployeeById(empid);
			System.out.println(emp);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}

	}

}
