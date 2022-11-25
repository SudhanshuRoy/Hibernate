package com.masai.main;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class GetDepartDetailsByEmployeeId {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
		Employee emp=em.find(Employee.class,3);
		 Department dept=emp.getDept();
		 System.out.println("deptId : "+dept.getDeptId());
		 System.out.println("deptName : "+dept.getDname());
		 System.out.println("deptLocation : "+dept.getLocation());
		
		System.out.println("done...");
				

	}

}
