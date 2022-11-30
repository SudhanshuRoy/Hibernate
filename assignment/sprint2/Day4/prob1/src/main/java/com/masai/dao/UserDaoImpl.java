package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entity.Email;
import com.masai.entity.User;
import com.masai.exception.UserException;
import com.masai.utility.EMUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> retrieveAllUser() throws UserException {
		List<User> users=new ArrayList<>();
		
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from User";
		Query q=em.createQuery(jpql);
		users=q.getResultList();
		if(users.size()==0) throw new UserException("No User Exist");
		em.close();
		return users;
	}

	@Override
	public boolean createOneUser(User user,Email email) throws UserException {
		boolean flag=false;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(user);
		flag=true;
		em.getTransaction().commit();
		em.close();
		if(flag==false) throw new UserException("User not inserted!"); 
		else System.out.println("User inserted successfully");
		em.close();
		return flag;
	}

	@Override
	public boolean deleteUser(int UserId) throws UserException {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		User user=em.find(User.class, UserId);
		if(user!=null)
		{
			em.getTransaction().begin();
			em.remove(user);
			em.getTransaction().commit();
			flag=true;
			
		}else throw new UserException("Invalid UserId");
		em.close();
		
		return flag;
	}

	@Override
	public Email retrieveEmailDetailFromUser(int UserId) throws UserException {
		Email email=null;
		EntityManager em=EMUtil.provideEntityManager();
		
		User user=em.find(User.class, UserId);
		if(user!=null) {
			email=user.getEmail();
		}else throw new UserException("Invalid user Id");
		em.close();
		return email;
	}
		

}
