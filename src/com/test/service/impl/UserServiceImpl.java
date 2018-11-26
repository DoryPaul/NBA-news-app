package com.test.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.mapper.UserMapper;
import com.test.mapper.UserMapperCustom;

import com.test.pojo.User;
import com.test.pojo.UserQueryVo;
import com.test.service.UserService;

public class UserServiceImpl implements UserService{
     @Autowired
	private UserMapperCustom userMapperCustom;
     
     @Autowired
	private UserMapper userMapper;
    

	@Override
	public User checkLogin(String username, String password)
			throws Exception {
		return userMapperCustom.checkLogin(username, password);
	}


	@Override
	public int register(User user) throws Exception {
		// TODO 自动生成的方法存根
		 return userMapperCustom.register(user);
		
	}


	@Override
	public List<User> userList(UserQueryVo userQueryVo) throws Exception {
		// TODO 自动生成的方法存根
		return userMapperCustom.userList(userQueryVo);
	}


	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO 自动生成的方法存根
		return userMapper.deleteByPrimaryKey(id);
	}


	@Override
	public List<User> findUserByName(UserQueryVo userQueryVo) throws Exception {
		// TODO 自动生成的方法存根
		return userMapperCustom.findUserByName(userQueryVo);
	}


	@Override
	public User selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}


	@Override
	public int updateByPrimaryKeySelective(User record) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}


	


 

	
}
