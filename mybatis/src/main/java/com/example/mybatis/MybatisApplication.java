package com.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

/**
 * <h3>mybatis</h3>
 * <p>启动类</p>
 *
 * @author : zhuxinkai
 * @date : 2020-02-10 11:35
 **/

@SpringBootApplication
@MapperScan("com.example.mybatis.mapper")
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
    }

}
