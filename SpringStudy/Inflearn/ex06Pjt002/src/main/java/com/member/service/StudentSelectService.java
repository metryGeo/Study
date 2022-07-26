package com.member.service;

import com.member.StudentDTO;
import com.member.dao.StudentDAO;

public class StudentSelectService {

	private StudentDAO studentDao;
	
	public StudentSelectService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public StudentDTO select(String sNum) {
		if(verify(sNum)) {
			return studentDao.select(sNum);
		} else {
			System.out.println("Student information is not available.");
		}
		
		return null;
	}
	
	public boolean verify(String sNum){
		StudentDTO student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}
