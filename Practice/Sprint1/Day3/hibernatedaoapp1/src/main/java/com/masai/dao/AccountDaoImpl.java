package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		boolean flag=false;
	EntityManager em=EMUtil.provideEntityManager();
	em.getTransaction().begin();
	em.persist(account);
	flag=true;
	em.getTransaction().commit();
	em.close();
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag=false;
	EntityManager em =	EMUtil.provideEntityManager();
	Account account=em.find(Account.class, accno);
	if(account!=null) {
		em.getTransaction().begin();
		em.remove(account);
	    flag=true;
	    em.getTransaction().commit();
	}		
	else
		System.out.println("account doesn't exist with accno : "+accno);
		em.close();
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag=false;
		EntityManager em = EMUtil.provideEntityManager();
		Account acc =em.find(Account.class, account.getAccno());
		if(acc!=null) {
			em.getTransaction().begin();
			em.merge(account);
			flag=true;
			em.getTransaction().commit();
		}else throw new IllegalArgumentException("Invalid argument");
		
		em.close();
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
//		Account account=null;
//		EntityManager em= EMUtil.provideEntityManager();
//		account=em.find(Account.class, accno);
//		return account;
		return EMUtil.provideEntityManager().find(Account.class, accno);
	}

}
