package com.qinjie.chapter3.service;

import com.qinjie.chapter3.dao.UserDao;
import com.qinjie.chapter3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findUserByName(String userName) {
        return userDao.findUserByUsername(userName);
    }
}
