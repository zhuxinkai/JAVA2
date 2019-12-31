package com.rl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * <h3>springmvc</h3>
 * <p>mvc-controller</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-27 17:59
 **/

@Controller

public class TestController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap mv){
        mv.addAttribute("msg", "SpringMVC");
        return "index";
    }
}
