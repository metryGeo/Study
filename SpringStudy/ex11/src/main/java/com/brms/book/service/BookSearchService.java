package com.brms.book.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.dao.BookDao;

public class BookSearchService implements InitializingBean, DisposableBean{
	@Autowired
	private BookDao bookDao;

	public BookSearchService() {
	}

	public Book searchBook(String bNums) {
		Book book = bookDao.select(bNums);
		return book;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 로 빈 객체 소멸!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 로 빈 객체 생성!");
		
	}

}
