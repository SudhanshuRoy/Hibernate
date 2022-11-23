package com.masai.dao;

import com.masai.exception.BookException;
import com.masai.model.Book;

public interface BookDao {
 public Book getBookById(int Id)throws BookException;
 public boolean createBook(Book book);
 public boolean deleteBookById(int Id);
 public boolean updateBookPrice(int Id);
 
}
