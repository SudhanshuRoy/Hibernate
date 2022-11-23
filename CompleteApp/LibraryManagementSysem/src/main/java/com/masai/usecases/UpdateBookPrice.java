package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;

public class UpdateBookPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book Id : ");
		int Id=sc.nextInt();
		BookDao dao=new BookDaoImpl();
		boolean flag= dao.updateBookPrice(Id);
		if(flag)
		{
			System.out.println();
			System.out.println("Book price became twice !");
		}
			

	}

}
