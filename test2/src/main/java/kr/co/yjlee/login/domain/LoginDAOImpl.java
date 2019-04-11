package kr.co.yjlee.login.domain;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.yjlee.login.dao.LoginDAO;

@Repository(value = "loginDAO")
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Override
	public UserDTO selectUser(String id,String password) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("id",id );
		param.put("password", password);
		return (UserDTO)sqlSession.selectOne("userMapper.SELECT_USER", param);
	}

	@Override
	public int selectCount(String string) {
		return sqlSession.selectOne("userMapper.SELECT_COUNT");
	}

}
