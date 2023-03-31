package org.example.dao.pojo;

import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Priority;

//@Component("userDao")
//dao层注解创建Bean
@Repository
//创建Bean是否单例的注解
//@Scope("singleton")
//加载jdbc.properties的注解方式
//@PropertySource("jdbc.properties")
public class UserDaopojo implements UserDao {

//    传入基本类型的引用注解
    @Value("123")
    private String name;
    @Override
    public void size() {
        System.out.println("dao"+name);
    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("int....");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy....");
//    }
}
