package com.test.zhuxinkai.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * <h3>parenttest</h3>
 * <p>用于测试@ModelAttribut</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-09 10:42
 **/
@RestController

public class HelloController2 {
    @GetMapping("/hello1")
    @ResponseBody
    public void hello(Model model){
        Map<String,Object> map = model.asMap();
        Set<String> ketSet = map.keySet();
        Iterator<String> iterator = ketSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key+">>>>>>"+value);
        }
}



}
