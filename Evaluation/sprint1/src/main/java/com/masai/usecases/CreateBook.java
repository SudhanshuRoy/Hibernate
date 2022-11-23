package com.masai.usecases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.model.Book;

public class CreateBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter author : ");
		String author=sc.next();
		System.out.println("Enter publication : ");
		String publication=sc.next();
		System.out.println("Enter category: ");
		String category=sc.next();
		System.out.println("Enter pages : ");
		int pages=sc.nextInt();
		System.out.println("Enter price : ");
		int price=sc.nextInt();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		String dateTime=dtf.format(now);
		
		Book book=new Book(name,author,publication,category,pages,price,dateTime);
		BookDao dao=new BookDaoImpl();
		boolean flag= dao.createBook(book);
		if(flag)
		{
			System.out.println();
			System.out.println("Book saved into library");
		}
			
		else System.out.println("Book couldn't save");

	}

}
