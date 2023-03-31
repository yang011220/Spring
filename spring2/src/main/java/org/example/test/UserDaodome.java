package org.example.test;

import org.example.dao.UserDao;
import org.example.servlet.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaodome {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = (UserDao) ap.getBean("userDao");
        UserServlet userServlet = (UserServlet) ap.getBean("userServlet");
        System.out.println(userDao);
        System.out.println(userServlet);
        userServlet.size();
        userDao.size();
    }
}
