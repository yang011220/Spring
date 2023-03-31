package org.example.Dao.pojo;

import org.example.Dao.UserDao;

public class UserDaoPojo implements UserDao {
    @Override
    public void size() {
        System.out.println("dao方法实现");
    }
}
