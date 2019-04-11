package kr.co.yjlee.login.service;

import kr.co.yjlee.login.domain.UserDTO;

public interface UserService {

	public UserDTO selectUser(String id, String password);

	public int selectCount(String string);
}
