package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Setter(onMethod_ = { @Autowired })
	private BoardMapper mapper;

//	@Test
	public void testgetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
//	@Test
	public void testinsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Spring_Title");
		vo.setContent("Spring_Content");
		vo.setWriter("Spring_Writer");
		
		mapper.insert(vo);
		log.info(vo);
	}
	
//	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Spring_select_Title");
		vo.setContent("Spring_select_Content");
		vo.setWriter("Spring_select_Writer");
		
		mapper.insertSelectKey(vo);
		log.info(vo);
	}
	
//	@Test
	public void testRead() {
		BoardVO vo = mapper.read((long)21);
		
		log.info(vo);
		
	}
	
//	@Test
	public void testDelete() {
		mapper.delete((long)21);
		
	}
	
//	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno((long)22);
		vo.setTitle("updated_Title");
		vo.setContent("updated_Content");
		vo.setWriter("updated_Writer");
		
		int count = mapper.update(vo);
		
		log.info("update Count : " + count);
	}
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
	

}
