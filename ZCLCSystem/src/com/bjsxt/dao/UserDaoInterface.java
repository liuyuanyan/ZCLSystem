package com.bjsxt.dao;

import com.bjsxt.vo.User;

public interface UserDaoInterface {
	/**
	 * �û���¼
	 * @param user
	 */
	public boolean doUserLogin(User user);
}
