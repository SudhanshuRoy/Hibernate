package com.masai.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.masai.entity.Email;
import com.masai.entity.User;
import com.masai.utility.EMUtil;

public class _1Insertion {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		Email e1=new Email();
		Email e2=new Email();
		
		e1.setMail_Id("s@gmail.com");
		e1.setCreated_date(LocalDate.now());

		
		e2.setMail_Id("r@gmail.com");
		e2.setCreated_date(LocalDate.now());
		
		User u1=new User();
		u1.setName("Sudhanshu");
		u1.setPhoneNo("7979099677");
		u1.setDateOfBirth(LocalDate.of(1998,9,20));
		u1.setEmail(e1);
		
		User u2=new User();
		u2.setName("Raj Parsad");
		u2.setPhoneNo("789874566");
		u2.setDateOfBirth(LocalDate.of(1996,6,10));
		u2.setEmail(e2);
		
		e1.setUser(u1);
		e2.setUser(u2);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.getTransaction().commit();
		em.close();
		System.out.println("done....");
				

	}

}
