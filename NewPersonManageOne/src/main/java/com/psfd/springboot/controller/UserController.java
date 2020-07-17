package com.psfd.springboot.controller;

import com.psfd.springboot.domain.Users;
import com.psfd.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/login")
    public String login(Users user, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("user = " + user);
        int count = userService.check(user);
        System.out.println("count = " + count);
        if (count == 1) {
            return "frame";
        }
        return "error";
    }

    @RequestMapping("/addUserTemp")
    public String addUserTemp() {
        return "users/adduser";
    }


    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(Users user) {
        System.out.println("user = " + user);
        user.setCreatetime(new Date());
        userService.addUser(user);
        return "增加用户成功";
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(Users user) {
        System.out.println("user = " + user);

        userService.updateUsers(user);
        return "修改用户成功";
    }

    @RequestMapping("/deleteUser")
    public String delete(Users user) {
        userService.deleteUsers(user);
        return "success";
    }

    @RequestMapping("/queryAllUser")
    public ModelAndView queryUser(ModelAndView modelAndView) {
        List<Users> userList = userService.queryAllUser();
        modelAndView.setViewName("users/listuser");
        modelAndView.addObject("userList", userList);
        System.out.println("userList = " + userList);
        return modelAndView;
    }

    @RequestMapping("/updateUserTemp")
    public ModelAndView updateUserTemp(String id, HttpServletRequest request) {
        System.out.println("id = " + id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users/updateuser");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

}
