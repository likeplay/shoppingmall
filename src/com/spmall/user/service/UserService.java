package com.spmall.user.service;

import java.util.List;

import com.spmall.common.model.User;



public interface UserService {
	public List<User> findUserList() throws Exception;
}
