package com.bjsxt.dao;

import com.bjsxt.vo.User;

public class UserDao implements UserDaoInterface{

	@Override
	public boolean doUserLogin(User user) {
		if(user.getUname().equals("ÁõæÂæÂ")&& user.getPwd().equals("1086")){
			return true;
		}
		return false;
	}

}
