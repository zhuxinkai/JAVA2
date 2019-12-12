package com.test.zhuxinkai.controller;

import org.springframework.web.bind.annotation.*;

/**
 * <h3>parenttest</h3>
 * <p>对spring boot 得cors 支持进行测试</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-09 14:36
 **/


@RestController
@RequestMapping("/bookcors")


public class CorsController {

    @GetMapping("/")
  // @CrossOrigin(value =  "http://127.0.0.1:8081",maxAge = 1800,allowedHeaders = "*",allowCredentials = "true")
    public String addBookGet(String name){
        System.out.println("这是一个GET方式的注解");
        return "receive:" + name;

    }
    @PostMapping("/")
  //  @CrossOrigin(value =  "www.baidu.com",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        System.out.println("这是一个POST方式的注解");
        return "receive:" + name;
    }
/*
delete方法中默认，如果不注明 @CrossOrigin 那么，是会提示 Invalid CORS request .这跟浏览器也有关系，
    不同的浏览器处理方式不同。
    比较好的方式，需要重写@CrossOrigin ,最好是做全绝写在 MyWebMvcConfig下
    重写  addCorsMapping  方法
 */


    @DeleteMapping ("/{id}")
  // @CrossOrigin(value =  "http://129.0.0.1:8081",maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id){
        System.out.println("这是一个删除方式的注解");
        return String.valueOf(id);

    }
}
