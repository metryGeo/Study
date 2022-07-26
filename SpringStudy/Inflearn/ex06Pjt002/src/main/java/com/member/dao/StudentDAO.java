package com.member.dao;

import java.util.HashMap;
import java.util.Map;

import com.member.StudentDTO;

public class StudentDAO {

	private Map<String, StudentDTO> dto = new HashMap<String, StudentDTO>();
	
	public void insert(StudentDTO StudentDTO) {
		dto.put(StudentDTO.getsNum(), StudentDTO);
	}
	
	public StudentDTO select(String sNum) {
		return dto.get(sNum);
	}
	
	public void update(StudentDTO StudentDTO) {
		dto.put(StudentDTO.getsNum(), StudentDTO);
	}
	
	public void delete(String sNum) {
		dto.remove(sNum);
	}
	
	public Map<String, StudentDTO> getdto() {
		return dto;
	}
	
}
