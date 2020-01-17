package com.example.mybatis.controller;

import com.example.mybatis.model.Person;
import com.example.mybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>mybatis</h3>
 * <p>usercontroller</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-16 16:47
 **/

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UsersService usersService;  //引入服务类接口。
    @RequestMapping("/register")
    public String register(){
        return "register";

    }
    @RequestMapping("/registerhtml")
  public String registerhtml(Person persons){

        this.usersService.addPerson(persons);
        return "success";

    }

}
