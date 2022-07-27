package org.zerock.controller;

import java.text.SimpleDateFormat;

import org.apache.ibatis.javassist.tools.rmi.Sample;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.dto.SampleDTO;
import org.zerock.dto.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController{
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new 
//				CustomDateEditor(dateFormat, false));
//	}
	
	
	@GetMapping("/ex01")
	public void basic(SampleDTO dto) {
		
		log.info("" + dto);
		
		log.info("basic............");
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		
		log.info("todo : " + todo);
		
		log.info("ex03............");
		return "ex03";
	}
	
	
	//page�� �α׿��� ������ jsp�� ������ �����ʴ´�.
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, int page) {
		
		log.info("dto : " + dto);
		log.info("page : " + page);
		log.info("ex03............");
		return "sample/ex04";
	}
	
	
	//Ÿ�Կ� ������� ������ Model�� ��Ƽ� ���޵Ǵ� @ModelAttribute�� �����
	//ex04������ ���� ���� �ʾҴ� intŸ�� page�� ����
	@GetMapping("/ex04_2")
	public String ex04_2(SampleDTO dto, @ModelAttribute("page") int page) {
		
		log.info("dto : " + dto);
		log.info("page : " + page);
		log.info("ex03............");
		return "sample/ex04";
	}
	
	
	//Json
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		
		SampleDTO dto = new SampleDTO();
		log.info("ex06................");
		dto.setAge(25);
		dto.setName("Kim");
		
		return dto;
	}
	
	//ResponseEntity
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07() {
		
		log.info("ex07................");
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(header, HttpStatus.OK);
	}
}
