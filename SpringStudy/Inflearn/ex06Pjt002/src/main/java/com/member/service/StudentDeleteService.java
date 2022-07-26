package com.member.service;

import com.member.StudentDTO;
import com.member.dao.StudentDAO;

public class StudentDeleteService {

	private StudentDAO studentDao;

	public StudentDeleteService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	public void delete(StudentDTO student) {
		if (verify(student.getsNum())) {
			studentDao.delete(student.getsNum());
		} else {
			System.out.println("Student information is not available.");
		}
	}

	public boolean verify(String sNum) {
		StudentDTO student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}
