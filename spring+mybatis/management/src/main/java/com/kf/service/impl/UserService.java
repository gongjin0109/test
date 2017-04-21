package com.kf.service.impl;

import com.kf.model.User;

import java.util.List;

/**
 * Created with IDEA
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:35
 */
public interface UserService {

	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	Integer addUser(User user);

	/**
	 * 获取所有用户信息
	 * @return
	 */
	List<User> selectAllUserInfo();

	/**
	 * 根据用户名修改用户信息
	 * @param user
	 * @return
	 */
	Integer updateUserInfoByUserId(User user);
}
