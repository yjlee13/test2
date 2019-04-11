package kr.co.yjlee.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.yjlee.login.domain.UserDTO;
import kr.co.yjlee.login.service.UserService;
import kr.co.yjlee.web.ResponseDTO;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	// 로그인 창으로 이동하는 컨트롤러 
	@RequestMapping(value = "loginForm")
	public ModelAndView loginForm(ModelAndView modelAndView) {
		
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}
	
	// 로그인 프로세스 컨트롤러
	@RequestMapping(value = "loginCheck")
	@ResponseBody
	public ResponseDTO loginCheck(@RequestParam String id,@RequestParam String password) {
		
		ResponseDTO responseDTO = new ResponseDTO();
		UserDTO user = userService.selectUser(id,password);
		
		if(user != null) {
			responseDTO.setResult("1");
			responseDTO.setResultValue(user);
		}else {
			responseDTO.setResult("0");
		}
		
		return responseDTO;
	}
	
}
