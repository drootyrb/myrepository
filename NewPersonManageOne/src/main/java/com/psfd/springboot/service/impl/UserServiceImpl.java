package com.psfd.springboot.service.impl;

import com.psfd.springboot.dao.UserDao;
import com.psfd.springboot.domain.Users;
import com.psfd.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void addUser(Users user) {
        userDao.addUser(user);
    }

    @Override
    public List<Users> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public int check(Users user) {
        return userDao.check(user);
    }

    @Override
    public void updateUsers(Users user) {
        userDao.updateUsers(user);
    }

    @Override
    public void deleteUsers(Users user) {
        userDao.deleteUsers(user);
    }
}
