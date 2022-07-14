package com.brms.dao;

import java.util.HashMap;
import java.util.Map;

import com.brms.book.Book;

public class BookDao {
	private Map<String, Book> bookDB = new HashMap<String, Book>(); // 임시 DB

	public void insert(Book book) {
		bookDB.put(book.getbNum(), book);
	}

	public Book select(String bNums) {
		return bookDB.get(bNums);
	}

	public void update() {
		// TODO Auto-generated method stub

	}

	public void delete() {
		// TODO Auto-generated method stub

	}

}
