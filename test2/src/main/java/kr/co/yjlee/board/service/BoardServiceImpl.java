package kr.co.yjlee.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.yjlee.board.dao.BoardDAO;
import kr.co.yjlee.board.domain.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	@Override
	public int insertBoard(BoardDTO boardDTO) {
		return boardDAO.insertBoard(boardDTO);
	}

	@Override
	public List<BoardDTO> getContentList(Map<String, Object> paramMap) {
		return boardDAO.getContentList(paramMap);
	}

	@Override
	public int getContentCnt(Map<String, Object> paramMap) {
		return boardDAO.getContentCnt(paramMap);
	}

}
