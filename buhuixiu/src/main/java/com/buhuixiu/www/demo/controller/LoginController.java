package com.buhuixiu.www.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>buhuixiu</h3>
 * <p>登录控制</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-23 14:21
 **/

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
