package com.psfd.springboot.service;

import com.psfd.springboot.domain.Users;

import java.util.List;

public interface IUserService {

    void addUser(Users user);

    List<Users> queryAllUser();

    int check(Users user);

    void updateUsers(Users user);

    void deleteUsers(Users user);
}
