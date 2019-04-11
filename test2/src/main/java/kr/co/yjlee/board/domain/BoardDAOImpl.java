package kr.co.yjlee.board.domain;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.yjlee.board.dao.BoardDAO;

@Repository(value = "boardDAO")
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Override
	public int insertBoard(BoardDTO boardDTO) {
		return sqlSession.insert("boardMapper.Insert_Board", boardDTO);
	}

	@Override
	public List<BoardDTO> getContentList(Map<String, Object> paramMap) {
		return sqlSession.selectList("boardMapper.select_Board", paramMap);
	}

	@Override
	public int getContentCnt(Map<String, Object> paramMap) {
		return sqlSession.selectOne("boardMapper.selectCnt_Board", paramMap);
	}
}
