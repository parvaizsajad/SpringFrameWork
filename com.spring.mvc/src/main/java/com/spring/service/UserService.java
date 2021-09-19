package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Dao.UserDao;
import com.spring.mvc.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
	
		
		return this.userDao.saveUser(user);
		
	}

}
