package com.masai.utility;

import javax.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		if(em!=null) System.out.println("Connected..");
		else System.out.println("Not connected..");

	}

}
