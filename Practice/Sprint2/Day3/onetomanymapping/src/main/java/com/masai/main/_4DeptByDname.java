package com.masai.main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.entities.Department;
import com.masai.utility.EMUtil;

public class _4DeptByDname {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from Department where dname=:deptname";
		TypedQuery<Department> q= em.createQuery(jpql,Department.class);
		q.setParameter("deptname","Development");
		Department dept=q.getSingleResult();
		em.close();
		System.out.println(dept.getLocation());
		dept.getEmps().forEach(emp->System.out.println(emp));

	}

}
