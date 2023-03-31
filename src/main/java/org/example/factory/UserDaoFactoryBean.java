package org.example.factory;

import org.example.Dao.UserDao;
import org.example.Dao.pojo.UserDaoPojo;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoPojo();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
