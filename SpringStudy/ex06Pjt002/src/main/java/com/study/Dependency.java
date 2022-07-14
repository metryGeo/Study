package com.study;

public class Dependency {
	private Injection injection;

	public Dependency(Injection injection) {
		System.out.println("injection 주입 완료!!");
		this.injection = injection;
	}

	

	public void setInjection(Injection injection) {
		this.injection = injection;
	}
	
}
