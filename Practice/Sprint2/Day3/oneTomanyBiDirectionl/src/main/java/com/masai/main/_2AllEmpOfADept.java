package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;
import java.util.List;

public class _2AllEmpOfADept {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Department d= em.find(Department.class, 1);
		
		List<Employee> emps= d.getEmps();
		
		emps.forEach(e ->{
			
			System.out.println(e.getEmpId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println("****************");
		});
		
		System.out.println("done...");

	}

}
