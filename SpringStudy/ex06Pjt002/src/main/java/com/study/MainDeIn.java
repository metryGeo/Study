package com.study;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDeIn {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Injection inje = ctx.getBean("injectionBean",Injection.class);
		
		Dependency dep_1 = ctx.getBean("dependencyBean", Dependency.class);
		
		Dependency dep_2 = ctx.getBean("dependencyBean", Dependency.class);
		
		if(dep_1.equals(dep_2)) {
			System.out.println("Equal!!");
		} else {
			System.out.println("Not Equal!!");
		}

	}

}
