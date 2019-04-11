package kr.co.yjlee.login.dao;

import kr.co.yjlee.login.domain.UserDTO;

public interface LoginDAO {
	public UserDTO selectUser(String id, String password);

	public int selectCount(String string);
}
