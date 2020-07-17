package com.psfd.springboot.dao;

import com.psfd.springboot.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    void addUser(Users user);

    List<Users> queryAllUser();

    int check(Users user);

    void updateUsers(Users user);

    void deleteUsers(Users user);

}
