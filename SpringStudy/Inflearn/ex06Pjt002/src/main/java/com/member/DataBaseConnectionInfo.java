package com.member;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DataBaseConnectionInfo {
	
	private String jdbcUrl;
	private String userId;
	private String userPw;
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		DataBaseConnectionInfo dci = ctx.getBean("jdbc", DataBaseConnectionInfo.class); 
		
		System.out.println(dci.jdbcUrl);
		System.out.println(dci.userId);
		System.out.println(dci.userPw);		//setter 확인
	
		
	}
	
}
