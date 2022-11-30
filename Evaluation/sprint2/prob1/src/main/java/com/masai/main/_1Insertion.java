package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.model.PhoneNumber;
import com.masai.model.User;
import com.masai.utility.EMUtil;

public class _1Insertion {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
//		Insert 2 Users with user name ‘Prateek’ and ‘Nrupul’
//		and both of them having 3 phone numbers each of type 
//		Home/Landline/office.
		
		User u1=new User();
		u1.setUserName("Prateek");
		u1.setEmailid("partik@gmail.com");
		
		User u2=new User();
		u2.setUserName("Nrupul");
		u2.setEmailid("nrupul@gmail.com");
		
		PhoneNumber n1=new PhoneNumber();
		n1.setPhoneNumber("7894561231");
		n1.setPhoneType("Home");
		
		PhoneNumber n2=new PhoneNumber();
		n2.setPhoneNumber("4561231");
		n2.setPhoneType("Landline");
		
		PhoneNumber n3=new PhoneNumber();
		n3.setPhoneNumber("245612");
		n3.setPhoneType("office");
		
		PhoneNumber n4=new PhoneNumber();
		n4.setPhoneNumber("7894561231");
		n4.setPhoneType("Home");
		
		PhoneNumber n5=new PhoneNumber();
		n5.setPhoneNumber("4561231");
		n5.setPhoneType("Landline");
		
		PhoneNumber n6=new PhoneNumber();
		n6.setPhoneNumber("245612");
		n6.setPhoneType("office");
		
		
		u1.getPhoneNumbers().add(n1);
		u1.getPhoneNumbers().add(n2);
		u1.getPhoneNumbers().add(n3);
		n1.setUser(u1);
		n2.setUser(u1);
		n3.setUser(u1);
		
		u2.getPhoneNumbers().add(n4);
		u2.getPhoneNumbers().add(n5);
		u2.getPhoneNumbers().add(n6);
		n4.setUser(u2);
		n5.setUser(u2);
		n6.setUser(u2);
		
		em.getTransaction().begin();
		em.persist(u1);
		em.persist(u2);
		em.getTransaction().commit();
		em.close();


	}

}
