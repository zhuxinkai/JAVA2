package com.test.zhuxinkai.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>parenttest</h3>
 * <p>全局数据配置</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-09 10:18
 **/

@ControllerAdvice
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String,String> userinfo(){
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("username","罗贯中");
        map.put("gender","男");
        return map;


    }
}
