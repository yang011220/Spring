package org.example.test;

import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
//        加载类路径下的配置文件
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");

        userService.size();
    }
}
