package com.bs.ex17.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.ex17.member.Member;
import com.bs.ex17.member.dao.MemberDao;

@Service
public class MemberService implements IMemberService{
	
	@Autowired
	MemberDao memberDao;
	
	
	public void memberRegister(String memId, String memPw, String memMail, String memPhone1,
			String memPhone2, String memPhone3) {
		memberDao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);//Dao로 Db에 저장
		
	}
	public Member memberSearch(String memId, String memPw) {
		System.out.println("memberSearch()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		
		Member member = memberDao.memberSelect(memId, memPw);
		
		return member;
	}
}
