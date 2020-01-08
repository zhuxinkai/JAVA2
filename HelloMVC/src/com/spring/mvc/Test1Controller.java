package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>HelloMVC</h3>
 * <p>contoller1</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-09 00:26
 **/
@Controller
@RequestMapping("/test1")
public class Test1Controller {
    @RequestMapping("/redirect.form")
    public String redirectResult(){
        return "ajax";
    }
}
