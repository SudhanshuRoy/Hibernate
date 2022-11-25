package com.masai.dao;

import java.util.Scanner;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details to update ");
		System.out.println("Enter employee Id of emp you want to update: ");
		int Id=sc.nextInt();
		System.out.println("Enter employee name : ");
		String name=sc.next();
		System.out.println("Enter address : ");
		String address=sc.next();
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		Employee emp=new Employee();
		emp.setEmpId(Id);
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(salary);
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			Employee employee= dao.updateEmployee(emp);
			System.out.println("updated employee :"+employee);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		

	}

}
