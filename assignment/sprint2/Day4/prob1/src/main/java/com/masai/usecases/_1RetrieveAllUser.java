package com.masai.usecases;



import java.util.List;

import com.masai.dao.UserDaoImpl;
import com.masai.entity.User;
import com.masai.exception.UserException;



public class _1RetrieveAllUser {

	public static void main(String[] args) {
		UserDaoImpl dao=new UserDaoImpl();
		try {
			List<User> users=dao.retrieveAllUser();
			users.forEach(u->System.out.println(u));
		} catch (UserException e) {
			
			e.printStackTrace();
		}
		

	}

}
