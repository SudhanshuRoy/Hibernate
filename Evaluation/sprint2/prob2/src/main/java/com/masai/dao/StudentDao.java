package com.masai.dao;

import com.masai.exception.StudentException;

public interface StudentDao {
	
	public void getStudent(int roll_no) throws StudentException;

}
