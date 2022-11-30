package com.masai.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.PhoneNumber;
import com.masai.model.User;
import com.masai.utility.EMUtil;

import java.util.List;

public class _2GetPhoneByUserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Use name : ");
		String name=sc.next();
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from User where userName=:name";
		
		TypedQuery<User> q=em.createQuery(jpql, User.class);
		q.setParameter("name", name);
		
		List<User> users=q.getResultList();
		
		if(users==null) System.out.println("Data not fount");
		else 
		{
			for(User u:users) {
			List<PhoneNumber> phones=u.getPhoneNumbers();
			for(PhoneNumber p:phones) {
				System.out.println(p);
			}
			}
		}

	}

}
