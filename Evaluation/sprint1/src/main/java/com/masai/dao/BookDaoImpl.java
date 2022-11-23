package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.util.EMUtil;

public class BookDaoImpl implements BookDao {

	@Override
	public Book getBookById(int Id) throws BookException {
	
//		return EMUtil.provideEntityManager().find(Book.class, Id);
		Book book=null;
		EntityManager em=EMUtil.provideEntityManager();
		book=em.find(Book.class, Id);
		if(book==null) {
			throw new BookException("Book doesn't exist with Id "+Id);
		}
		em.close();
		return book;
	}

	@Override
	public boolean createBook(Book book) {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(book);
		flag=true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	@Override
	public boolean deleteBookById(int Id) {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		Book book=em.find(Book.class, Id);
		if(book!=null)
		{
			em.getTransaction().begin();
			em.remove(book);
			flag=true;
			em.getTransaction().commit();	
		}else System.out.println("Book doesn't exist with Id "+Id);
		
		em.close();
		return flag;
	}

	@Override
	public boolean updateBookPrice(int Id) {
		
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		Book book=em.find(Book.class, Id);
		if(book!=null)
		{
			em.getTransaction().begin();
			book.setPrice(book.getPrice()*2);
			flag=true;
			em.getTransaction().commit();	
		}else System.out.println("Book doesn't exist with Id "+Id);
		
		em.close();
		return flag;
	}

}
