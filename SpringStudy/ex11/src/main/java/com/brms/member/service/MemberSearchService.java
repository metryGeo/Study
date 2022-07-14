package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.dao.MemberDao;
import com.brms.member.Member;

public class MemberSearchService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberSearchService() { }
	
	public Member searchMember(String mId) {
		return memberDao.select(mId);
	}
	
}