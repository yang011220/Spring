package org.example.dao.pojo;

import org.example.dao.UserDao;

public class UserDaopojo implements UserDao {

    @Override
    public void size() {
        System.out.println("dao");
    }
}
