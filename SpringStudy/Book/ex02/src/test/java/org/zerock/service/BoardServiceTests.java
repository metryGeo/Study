package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	@Setter(onMethod_ = { @Autowired })
	private BoardService service;
	
//	@Test
	public void testExist() {	
		
		log.info(service);
		assertNotNull(service);
		
	}
	
//	@Test
	public void testRegister() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("새로작성하는 글");
		vo.setContent("새로작성하는 컨");
		vo.setWriter("새로작성하는 유저");
		
		service.register(vo);
		
		log.info("생성된 게시물의 번호 : " + vo.getBno());
	}
	
	@Test
	public void testGetList() {
//		service.getList().forEach(vo ->log.info(vo));
		
		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
	}
	
//	@Test
	public void testGet() {
		log.info("Get : " + service.get((long)61).toString());
	}
	
//	@Test
	public void testDelete() {
		log.info("REMOVE : " + service.remove((long)61));
	}
	
//	@Test
	public void testUpdate() {
		BoardVO vo = service.get((long)22);
		
		if (vo == null) {
			return;
		}
		
		vo.setContent("new_content");
		vo.setTitle("new_Title");
		vo.setWriter("new_writer");
		log.info("UPDATE : " +service.modify(vo));
	}
	
}
