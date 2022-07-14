package com.brms;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.brms.book.Book;
import com.brms.book.service.BookRegisterService;
import com.brms.book.service.BookSearchService;
import com.brms.member.Member;
import com.brms.member.service.MemberRegisterService;
import com.brms.member.service.MemberSearchService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bNums = { "739", "985", "184", "830", "816" };
		String[] bTitles = { "html", "css", "jQuery", "java", "spring" };
		
		String[] mIds = { "rabbit", "hippo", "raccoon", "elephan", "lion" };
		String[] mPws = { "96539", "94875", "15284", "48765", "28661" };
		String[] mNames = { "agatha", "barbara", "chris", "doris", "elva" };
		
		//스프링 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		BookRegisterService brs = ctx.getBean("BookRegisterService", BookRegisterService.class);
		
		
		//도서 목록 생성
		for (int i = 0; i < bNums.length; i++) {
			Book book = new Book(bNums[i], bTitles[i], "Can", null);
			brs.regist(book);
		}
		
		BookSearchService bss = ctx.getBean("BookSearchService", BookSearchService.class);
		System.out.println("========================================================");
		
		//도서 목록 출력
		for (int i = 0; i < bNums.length; i++) {
			Book book = bss.searchBook(bNums[i]);
			System.out.print(book.getbNum() + "\t");
			System.out.print(book.getbTitle() + "\t");
			System.out.print(book.getbCanRental() + "\t");
			System.out.println(book.getbMember() + "\t");
		}
		
		// 더미 회원 목록 등록
		MemberRegisterService memberRegisterService = 
				ctx.getBean("memberRegisterService", MemberRegisterService.class);
		for (int i = 0; i < mIds.length; i++) {
			Member member = new Member(mIds[i], mPws[i], mNames[i]);
			memberRegisterService.register(member);
		}
				
		// 더미 회원 목록 출력
		MemberSearchService memberSearchService = 
				ctx.getBean("memberSearchService", MemberSearchService.class);
		System.out.println("\nmId\tmPw\tmName");
		System.out.println("------------------------------------------");
		for (int i = 0; i < mIds.length; i++) {
			Member member = memberSearchService.searchMember(mIds[i]);
			System.out.print(member.getmId() + "\t");
			System.out.print(member.getmPw() + "\t");
			System.out.print(member.getmName() + "\n");
		}
				
				
		ctx.close();
		
	}

}
