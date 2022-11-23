package com.masai.main;

import java.util.Scanner;

import com.masai.usecases.CreateBook;
import com.masai.usecases.DeleteBookById;
import com.masai.usecases.GetBookById;
import com.masai.usecases.UpdateBookPrice;

public class Main {

	public static void main(String[] args) {
		System.out.println("***************************");
		System.out.println("Library management system !");
		System.out.println("***************************");
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter 1 for : create book");
			System.out.println("Enter 2 for : delete book");
			System.out.println("Enter 3 for : search book");
			System.out.println("Enter 4 for : update price by double");
			System.out.println("Enter 5 for : exist");
		System.out.println("Enter choice : ");
		int choice =sc.nextInt();
		
		if(choice==5) break;
		
		switch(choice) {
		case 1:
			CreateBook.main(args);
			break;
		case 2:
			DeleteBookById.main(args);
			break;
		case 3:
			GetBookById.main(args);
			break;
		case 4:
			UpdateBookPrice.main(args);
			break;
			default:
				System.out.println("Thank You !");
		}
	    System.out.println();
		System.out.println("**********************");
		}

	}

}
