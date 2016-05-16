package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;

/**
 * 
 * 
 * @author 	Lian
 * @date	2016年5月16日
 * @since	1.0	
 */
public interface IUserDao {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
