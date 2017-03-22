package com.test.gx.service;

import com.test.gx.dao.UserMapper;
import com.test.gx.model.User;

public class UserService {

	private UserMapper userDao;
	int deleteByPrimaryKey(Integer id){
		return userDao.deleteByPrimaryKey(id);
	}

    int insert(User record){
    	return userDao.insert(record);
    }

    int insertSelective(User record){
    	return userDao.insertSelective(record);
    }

    public User selectByPrimaryKey(Integer id){
    	return userDao.selectByPrimaryKey(id);
    }

    int updateByPrimaryKeySelective(User record){
    	return userDao.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(User record){
    	return userDao.updateByPrimaryKey(record);
    };
}
