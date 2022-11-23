package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class DepositeUseCase {

	public static void main(String[] args) {
        AccountDao dao=new AccountDaoImpl();
		
//		Account acc1=new Account();
//		acc1.setName("Ramesh");
//		acc1.setBalance(880);
//
//		
//		
//		boolean f= dao.createAccount(acc1);
//		
//		if(f)
//			System.out.println("Account created..");
//		else
//			System.out.println("Not created...");
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account number");
		int ano=sc.nextInt();
		
		Account acc= dao.findAccount(ano);
		
		if(acc == null)
			System.out.println("Account does not exist..");
		else{
			
			
			System.out.println("Enter the Amount to Deposit");
			int amt=sc.nextInt();
			
			acc.setBalance(acc.getBalance()+amt);
			
			boolean f =dao.updateAccount(acc);
			
			if(f)
				System.out.println("Deposited Sucessfully...");
			else
				System.out.println("Technical Error .....");
					
		}

	}

}
