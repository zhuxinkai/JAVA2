package com.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>HelloMVC</h3>
 * <p>扫描器</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-02 17:08
 **/

//返回值： String 代表ModelAndView中viewName ,视图解析器前缀和后缀之间的路径。
    @Controller
@RequestMapping("/test")  //放在类上，用于相同方法名的不同类的方法映射。
public class TestController {
    @RequestMapping("/hello.form")
        public String hello(){
        return "index";
    }



}
