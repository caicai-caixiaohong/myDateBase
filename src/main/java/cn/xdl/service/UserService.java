package cn.xdl.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.User;
import cn.xdl.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public User login(String name,String password) {
		return userDao.findUserByNameAndPassword(name, password);
	}
}
