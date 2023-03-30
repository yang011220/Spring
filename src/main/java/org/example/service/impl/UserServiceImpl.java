package org.example.service.impl;

import org.example.Dao.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {
    public void setUserDao(UserDao userDao){
        System.out.println("调用setUserDao方法："+userDao);
    }

}
