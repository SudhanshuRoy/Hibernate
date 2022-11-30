package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.UserDao;
import com.masai.dao.UserDaoImpl;
import com.masai.exception.UserException;

public class _3deleteUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id : ");
		int userId=sc.nextInt();
		UserDao dao=new UserDaoImpl();
		try {
			boolean flag=dao.deleteUser(userId);
			if(flag) System.out.println("User deleted successfully !");
		} catch (UserException e) {
			
			e.printStackTrace();
		}
		

	}

}
