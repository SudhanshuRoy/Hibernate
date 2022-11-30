package com.masai.usecases;

import java.time.LocalDate;
import java.util.Scanner;

import com.masai.dao.UserDao;
import com.masai.dao.UserDaoImpl;
import com.masai.entity.Email;
import com.masai.entity.User;
import com.masai.exception.UserException;

public class _2InsertOneUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name : ");
		String name=sc.next();
		
		System.out.println("Enter phone number : ");
		String phone=sc.next();
		
		System.out.println("Enter Date Of Birth");
		System.out.println("Enter year : ");
		int year=sc.nextInt();
		System.out.println("Enter month(ex:9 or 10) : ");
		int month=sc.nextInt();
		System.out.println("Enter day : ");
		int date=sc.nextInt();

		LocalDate DOB=LocalDate.of(year, month, date);
		User user=new User();
		user.setName(name);
		user.setPhoneNo(phone);
		user.setDateOfBirth(DOB);
		
		
		Email email=new Email();
		System.out.println("Enter user email Id : ");
		String  emil=sc.next();
		email.setCreated_date(LocalDate.now());
		email.setMail_Id(emil);
		email.setUser(user);
		
		user.setEmail(email);
		
		UserDao dao=new UserDaoImpl();
		try {
			dao.createOneUser(user, email);
		} catch (UserException e) {
			
			e.printStackTrace();
		}
		
	}

}
