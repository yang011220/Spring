package org.example.test;

import org.example.Dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoFactoryBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao factoryBean = (UserDao) classPathXmlApplicationContext.getBean("factoryBean");
        factoryBean.size();

    }
}
