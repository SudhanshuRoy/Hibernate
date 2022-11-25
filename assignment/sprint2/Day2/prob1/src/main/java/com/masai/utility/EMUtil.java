package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	

	private static EntityManagerFactory emf;
	static {
	emf=Persistence.createEntityManagerFactory("hash-Unit");
	}
	
//	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Unite");
	
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
