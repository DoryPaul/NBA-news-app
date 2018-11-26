package com.test.mapper;

import java.util.List;

import com.test.pojo.User;
import com.test.pojo.UserQueryVo;

public interface UserMapperCustom {

	
	public User  checkLogin(String username,String password) throws Exception;
	public int  register(User user) throws Exception;
	public List<User> userList(UserQueryVo userQueryVo) throws Exception;
	public List<User> findUserByName(UserQueryVo userQueryVo) throws Exception;

}
