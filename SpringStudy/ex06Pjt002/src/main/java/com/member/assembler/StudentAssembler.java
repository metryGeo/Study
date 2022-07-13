package com.member.assembler;

import com.member.dao.StudentDAO;
import com.member.service.StudentAllSelectService;
import com.member.service.StudentDeleteService;
import com.member.service.StudentModifyService;
import com.member.service.StudentRegisterService;
import com.member.service.StudentSelectService;

public class StudentAssembler {		//객체 생성 및 조립 클래스 (applicationcontext.xml 역할)

	private StudentDAO studentDao;
	private StudentRegisterService registerService;
	private StudentModifyService modifyService;
	private StudentDeleteService deleteService;
	private StudentSelectService selectService;
	private StudentAllSelectService allSelectService;
	
	public StudentAssembler() {		//각 Service에 Dao 주입
		studentDao = new StudentDAO();
		registerService = new StudentRegisterService(studentDao);
		modifyService = new StudentModifyService(studentDao);
		deleteService = new StudentDeleteService(studentDao);
		selectService = new StudentSelectService(studentDao);
		allSelectService = new StudentAllSelectService(studentDao);
	}

	public StudentDAO getStudentDao() {		//각 Service getter, setter 설정으로 갈아낄 수 있도록 설정
		return studentDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	public StudentRegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(StudentRegisterService registerService) {
		this.registerService = registerService;
	}

	public StudentModifyService getModifyService() {
		return modifyService;
	}

	public void setModifyService(StudentModifyService modifyService) {
		this.modifyService = modifyService;
	}

	public StudentDeleteService getDeleteService() {
		return deleteService;
	}

	public void setDeleteService(StudentDeleteService deleteService) {
		this.deleteService = deleteService;
	}

	public StudentSelectService getSelectService() {
		return selectService;
	}

	public void setSelectService(StudentSelectService selectService) {
		this.selectService = selectService;
	}

	public StudentAllSelectService getAllSelectService() {
		return allSelectService;
	}

	public void setAllSelectService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}

	
}
