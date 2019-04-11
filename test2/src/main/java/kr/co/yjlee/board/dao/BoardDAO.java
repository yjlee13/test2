package kr.co.yjlee.board.dao;

import java.util.List;
import java.util.Map;

import kr.co.yjlee.board.domain.BoardDTO;

public interface BoardDAO {
	public int insertBoard(BoardDTO boardDTO);
	
	List<BoardDTO> getContentList(Map<String, Object> paramMap);
	
	int getContentCnt(Map<String, Object> paramMap);
	
}
