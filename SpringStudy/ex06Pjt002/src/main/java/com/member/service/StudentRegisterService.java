package com.member.service;

import com.member.StudentDTO;

import com.member.dao.StudentDAO;

public class StudentRegisterService {

	private StudentDAO StudentDAO;

	public StudentRegisterService(StudentDAO StudentDAO) {
		this.StudentDAO = StudentDAO;
	}

	public void register(StudentDTO student) {
		String sNum = student.getsNum();
		if (verify(student.getsNum())) {
			StudentDAO.insert(student);
		} else {
			System.out.println("The student has already registered.");
		}
	}

	public boolean verify(String sNum) {
		StudentDTO student = StudentDAO.select(sNum);
		return student == null ? true : false;
	}
}
