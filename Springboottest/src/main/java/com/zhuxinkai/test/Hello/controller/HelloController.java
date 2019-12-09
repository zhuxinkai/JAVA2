package com.zhuxinkai.test.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @GetMapping("/zhuxinkai")

        public String hello() {
            return "hello ,my spring boot";
        }

}
