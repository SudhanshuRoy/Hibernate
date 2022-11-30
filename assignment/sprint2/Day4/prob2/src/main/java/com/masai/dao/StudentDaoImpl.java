package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public boolean createStudent(Student student) throws StudentException {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(student);
		flag=true;
		em.getTransaction().commit();
		if(flag==false) throw new StudentException("Sudent Insertion fail");
		em.close();
		return flag;
	}

}
