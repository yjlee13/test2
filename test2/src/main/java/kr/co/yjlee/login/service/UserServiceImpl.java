package kr.co.yjlee.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.yjlee.login.dao.LoginDAO;
import kr.co.yjlee.login.domain.UserDTO;

@Service
public class UserServiceImpl implements UserService{

	@Resource(name = "loginDAO")
	private LoginDAO loginDAO;
	
	@Override
	public UserDTO selectUser(String id, String password) {
		UserDTO user = (UserDTO)loginDAO.selectUser(id,password);
		return user;
	}

	@Override
	public int selectCount(String string) {
		return loginDAO.selectCount(string);
	}

}
