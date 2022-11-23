package com.masai.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		EntityManager em= EMUtil.provideEntityManager();
		if(em!=null) {
			System.out.println("Connected..");
		}else {
			System.out.println("Connection fail!");
		}

	}

}
