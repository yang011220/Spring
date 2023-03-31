package org.example.service.impl;

import org.example.Dao.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        System.out.println("调用setUserDao方法："+userDao);
        this.userDao= userDao;
    }

    @Override
    public void size() {
        System.out.println("servlet方法实现");
        userDao.size();
    }
}
