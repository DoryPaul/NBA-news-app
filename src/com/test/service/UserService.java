package com.test.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.test.pojo.User;
import com.test.pojo.UserQueryVo;

public interface UserService {
	//public boolean  checkLogin(String username,String password) throws Exception;

	public User  checkLogin(String username,String password) throws Exception;
	public int register(User user) throws Exception;
	public List<User> userList(UserQueryVo userQueryVo) throws Exception;
	public  int deleteByPrimaryKey(Integer id) throws Exception;
	public List<User> findUserByName(UserQueryVo userQueryVo) throws Exception;
	public  User selectByPrimaryKey(Integer id)throws Exception;
	public    int updateByPrimaryKeySelective(User record)throws Exception;
}
