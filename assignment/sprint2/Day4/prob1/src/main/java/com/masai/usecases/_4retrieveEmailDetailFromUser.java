package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.UserDao;
import com.masai.dao.UserDaoImpl;
import com.masai.entity.Email;
import com.masai.exception.UserException;

public class _4retrieveEmailDetailFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id : ");
		int userId=sc.nextInt();
		
		UserDao dao=new UserDaoImpl();
		try {
		Email email=	dao.retrieveEmailDetailFromUser(userId);
		System.out.println("Email_Id : "+email.getMail_Id());
		System.out.println("Email_createdDate : "+email.getCreated_date());
		
			
		} catch (UserException e) {
			
			e.printStackTrace();
		}
	}

}
