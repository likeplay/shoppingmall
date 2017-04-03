package com.spmall.user.service;

import java.util.List;

import com.spmall.common.model.CtUser;

public interface UserService {
	public List<CtUser> findUserList() throws Exception;
}
