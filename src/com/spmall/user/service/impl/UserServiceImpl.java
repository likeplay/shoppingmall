package com.spmall.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spmall.common.mapper.UserMapper;
import com.spmall.common.model.User;
import com.spmall.common.model.UserExample;
import com.spmall.user.service.UserService;

public class UserServiceImpl implements UserService{

	
	@Autowired UserMapper ctUser;
	@Override
	public List<User> findUserList() throws Exception {
		UserExample example=new UserExample();
		return ctUser.selectByExample(example);
	}

}
