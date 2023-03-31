package org.example.dao.pojo;

import org.example.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Component("userDao")
//@Repository("userDao2")
//@Scope("singleton")
public class UserDaopojo2 implements UserDao {

    @Override
    public void size() {
        System.out.println("dao2");
    }
//    @PostConstruct
//    public void init() {
//        System.out.println("int....");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy....");
//    }
}
