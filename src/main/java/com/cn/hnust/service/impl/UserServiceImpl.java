package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

/**
 * 
 * 
 * @author 	Lian
 * @date	2016年5月16日
 * @since	1.0	
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

}
