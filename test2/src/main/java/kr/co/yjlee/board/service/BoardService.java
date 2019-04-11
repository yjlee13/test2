package kr.co.yjlee.board.service;

import java.util.List;
import java.util.Map;

import kr.co.yjlee.board.domain.BoardDTO;

public interface BoardService {

	public int insertBoard(BoardDTO boardDTO);
	
	List<BoardDTO> getContentList(Map<String, Object> paramMap);
	
	int getContentCnt(Map<String, Object> paramMap);
}
