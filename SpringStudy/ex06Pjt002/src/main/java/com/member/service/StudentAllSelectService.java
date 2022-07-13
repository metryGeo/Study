package com.member.service;

import java.util.Map;

import com.member.StudentDTO;
import com.member.dao.StudentDAO;

public class StudentAllSelectService {

	private StudentDAO studentDao;

	public StudentAllSelectService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	public Map<String, StudentDTO> allSelect() {
		return studentDao.getdto();
	}

}