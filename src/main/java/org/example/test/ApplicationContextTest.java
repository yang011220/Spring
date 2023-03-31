package org.example.test;

import org.example.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");

        userService.size();
    }
}
