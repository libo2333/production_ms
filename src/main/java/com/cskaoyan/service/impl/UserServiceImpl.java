package com.cskaoyan.service.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by little Stone
 * Date 2019/5/15 Time 11:09
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public boolean login(String username, String password) {
		User user = userMapper.queryUserByUsernameAndPassword(username, password);
		return user != null;
	}
}
