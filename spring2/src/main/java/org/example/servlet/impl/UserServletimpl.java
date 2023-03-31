package org.example.servlet.impl;

import org.example.dao.UserDao;
import org.example.servlet.UserServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//业务层注解创建Bean
@Service("userServlet")
public class UserServletimpl implements UserServlet {

//    开发依赖注入注解
    @Autowired
//    当有相同引用类型时可以使用这个注解切换不同依赖的的引用
//    例：吧userDao换userDao2   @Qualifier("userDao")->@Qualifier("userDao2")
    @Qualifier("userDao")
    private UserDao userDao;

//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void size() {
        System.out.println("servlet");
        userDao.size();
    }
}
