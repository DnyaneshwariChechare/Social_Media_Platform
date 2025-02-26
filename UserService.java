package com.service;

import com.dao.UserDao;
import com.entities.User;

public class UserService {

    private final UserDao userDAO = new UserDao();

    public void registerUser(User user) {
        UserDao.saveUser(user);
    }
}

