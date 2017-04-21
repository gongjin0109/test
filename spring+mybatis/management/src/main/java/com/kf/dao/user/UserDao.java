package com.kf.dao.user;

import com.kf.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 映射数据库表【t_user】
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:09
 */
public interface UserDao {

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
