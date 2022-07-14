package com.brms.book.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.dao.BookDao;

public class BookRegisterService implements InitializingBean, DisposableBean {
	@Autowired
	private BookDao bookDao;

	public BookRegisterService() {
	}

	public void regist(Book book) {
		bookDao.insert(book);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 로 빈 객체 소멸!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 로 빈 객체 생성!");

	}
	
	public void destroy_method() {
		System.out.println("destroy_method 로 빈 객체 소멸!");

	}
	
	public void init_method() {
		System.out.println("init_method로 빈객체 생성 !");
	}

}
