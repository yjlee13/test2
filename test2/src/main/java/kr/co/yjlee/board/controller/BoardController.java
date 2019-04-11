package kr.co.yjlee.board.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.yjlee.board.domain.BoardDTO;
import kr.co.yjlee.board.service.BoardService;
import kr.co.yjlee.web.ResponseDTO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	// 로그인이 됐으면 리스트 컨트롤러
	@RequestMapping(value = "bbList")
	public ModelAndView bbList(ModelAndView modelAndView) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		modelAndView.setViewName("bbList");
		modelAndView.addObject("boardList", boardService.getContentList(paramMap));
		modelAndView.addObject("boardCnt", boardService.getContentCnt(paramMap));
		
		return modelAndView;
	}
	
	@RequestMapping(value = "bbListWrite")
	public ModelAndView bbListWrite(ModelAndView modelAndView) {
		
		modelAndView.setViewName("bbListWrite");
		return modelAndView;
	}
	
	@RequestMapping(value = "bbListWriteadd")
	@ResponseBody
	public ResponseDTO bbListWriteadd(BoardDTO boardDTO) {
		ResponseDTO responseDTO = new ResponseDTO();
		
		logger.debug("boardDTO=", boardDTO.toString());
		
		boardService.insertBoard(boardDTO);
		
		return responseDTO;
	}	
	
}
