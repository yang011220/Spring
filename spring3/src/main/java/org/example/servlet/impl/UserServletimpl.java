package org.example.servlet.impl;

import org.example.dao.UserDao;
import org.example.servlet.UserServlet;

public class UserServletimpl implements UserServlet {

    @Override
    public void size() {
        System.out.println("servlet");
    }
}
