package com.member.service;

import com.member.StudentDTO;
import com.member.dao.StudentDAO;

public class StudentModifyService {

	private StudentDAO studentDao;
	
	public StudentModifyService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public void modify(StudentDTO student) {
		if(verify(student.getsNum())) {
			studentDao.update(student);
		} else {
			System.out.println("Student information is not available.");
		}
	}
	
	public boolean verify(String sNum){
		StudentDTO student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}
