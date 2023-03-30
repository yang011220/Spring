package org.example.test;

import org.example.Dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import javax.swing.*;

public class BeanFactoryTest {
    public static void main(String[] args) {
//        创建工厂对象
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        创建读取器(xml文件)
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        读取配置文件给工厂
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
//        根据id获取工厂对象
        UserService bean = (UserService) defaultListableBeanFactory.getBean("userService");
//        System.out.println(bean);
        UserDao userDao = (UserDao) defaultListableBeanFactory.getBean("userDao");

//        System.out.println(userDao);
    }
}
