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
	
	
	//page가 로그에는 남지만 jsp로 전달이 되지않는다.
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, int page) {
		
		log.info("dto : " + dto);
		log.info("page : " + page);
		log.info("ex03............");
		return "sample/ex04";
	}
	
	
	//타입에 관계없이 무조건 Model에 담아서 전달되는 @ModelAttribute를 사용해
	//ex04에서는 전달 되지 않았던 int타입 page를 전달
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
