package com.masai.dao;

import java.util.List;

import com.masai.entity.Email;
import com.masai.entity.User;
import com.masai.exception.UserException;

public interface UserDao {
	
	public List<User> retrieveAllUser() throws UserException;
	public boolean createOneUser(User user,Email email) throws UserException;
	public boolean deleteUser(int UserId) throws UserException;
	public Email retrieveEmailDetailFromUser(int UserId) throws UserException;
	

}
