package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	public List<BoardVO> getList();
	
	//Criteria
	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO vo);

	public void insertSelectKey(BoardVO vo);

	public BoardVO read(Long bno);
	
	public int delete(Long bno);

	public int update(BoardVO vo);
}
