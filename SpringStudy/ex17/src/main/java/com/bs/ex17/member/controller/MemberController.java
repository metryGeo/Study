package com.bs.ex17.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.ex17.member.Member;
import com.bs.ex17.member.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	@Autowired
	MemberService ms;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/memJoin", method = RequestMethod.POST)
	public String joinOk(Member member) {
		
//		String memId = request.getParameter("memId");
//		String memPw = request.getParameter("memPw");
//		String memMail = request.getParameter("memMail");
//		String memPhone1 = request.getParameter("memPhone1");
//		String memPhone2 = request.getParameter("memPhone2");
//		String memPhone3 = request.getParameter("memPhone3");	//form으로 받은 값 String으로 바꿈
		
		ms.memberRegister(member.getMemId(), member.getMemPw(), member.getMemMail(), 
				member.getMemPhone1(), member.getMemPhone2(),  member.getMemPhone3());	//service를 사용해 DB에 저장
		
		
//		model.addAttribute("memId", memId);
//		model.addAttribute("memPw", memPw);
//		model.addAttribute("memMail", memMail);
//		model.addAttribute("memPhone1", memPhone1);
//		model.addAttribute("memPhone2", memPhone2);
//		model.addAttribute("memPhone3", memPhone3);
		
		
		return "memJoinOk";
	}
	
	@RequestMapping(value = "/memLogin", method = RequestMethod.POST)
	public String loginOk(Locale locale, Model model, HttpServletRequest request) {
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		ms.memberSearch(memId, memPw);
		
		model.addAttribute("memId", memId);
		model.addAttribute("memPw", memPw);
		
		return "memLoginOk";
	}
	
}
