package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class GetEmployeeById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id : ");
		int Id=sc.nextInt();
		
		
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			Employee emp= dao.getEmployeeById(Id);
			System.out.println(emp);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}

	}

}
