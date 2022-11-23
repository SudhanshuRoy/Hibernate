package com.masai.utility;

import javax.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		System.out.println(em);

	}

}
