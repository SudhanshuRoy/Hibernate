package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.exception.BookException;
import com.masai.model.Book;

public class GetBookById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book Id : ");
		int Id=sc.nextInt();
		
		BookDao dao=new BookDaoImpl();
		
		try {
		Book book = dao.getBookById(Id);
		System.out.println();
		System.out.println(book);
		} catch (BookException e) {
			
			e.printStackTrace();
		}
		

	}

}
