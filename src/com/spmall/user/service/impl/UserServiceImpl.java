package com.spmall.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spmall.common.mapper.CtUserMapper;
import com.spmall.common.model.CtUser;
import com.spmall.common.model.CtUserExample;
import com.spmall.user.service.UserService;

public class UserServiceImpl implements UserService{

	
	@Autowired CtUserMapper ctUser;
	@Override
	public List<CtUser> findUserList() throws Exception {
		CtUserExample example=new CtUserExample();
		return ctUser.selectByExample(example);
	}

}
