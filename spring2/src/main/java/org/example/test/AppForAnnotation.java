package org.example.test;

import org.example.config.springconfig;
import org.example.dao.UserDao;
import org.example.servlet.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.format.AnnotationFormatterFactory;

import javax.sql.DataSource;
import java.lang.annotation.AnnotationFormatError;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(springconfig.class);
//        UserDao bean = (UserDao) annotationConfigApplicationContext.getBean("userDao");
//        System.out.println(bean);
//        bean.size();
//        UserServlet userServlet = (UserServlet) annotationConfigApplicationContext.getBean("userServlet");
///       System.out.println(userServlet);
//        userServlet.size();
//        annotationConfigApplicationContext.close();
        DataSource bean = annotationConfigApplicationContext.getBean(DataSource.class);
        System.out.println(bean);

    }
}
