package com.kf.service.impl;

import com.kf.common.model.util.NumberUtil;
import com.kf.dao.user.UserDao;
import com.kf.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:36
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public Integer addUser(User user) {
		return NumberUtil.intValue(userDao.addUser(user));
	}

	@Override
	public List<User> selectAllUserInfo() {
		return userDao.selectAllUserInfo();
	}

	@Override
	public Integer updateUserInfoByUserId(User user) {
		return NumberUtil.intValue(userDao.updateUserInfoByUserId(user));
	}
}
