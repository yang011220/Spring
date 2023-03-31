package org.example.service.impl;

import org.example.Dao.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
//    测试读properties文件
//    private String username;
    public void setUserDao(UserDao userDao){
        System.out.println("输出UserDaoPojo："+userDao);
        this.userDao= userDao;
    }
//    测试读properties文件
//    public void setUsername(String username) {
//        this.username = username;
//    }

    @Override
    public void size() {
        System.out.println("servlet方法实现");
//        this.username = username;
//        System.out.println(username);
    }
}
