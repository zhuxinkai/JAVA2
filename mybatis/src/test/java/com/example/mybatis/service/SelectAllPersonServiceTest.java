package com.example.mybatis.service;


import com.example.mybatis.MybatisApplication;
import com.example.mybatis.MybatisApplicationTests;
import com.example.mybatis.mapper.SelectAllPersonMapper;
import com.example.mybatis.model.Person;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/*
1,当前类为springboot的测试类
加载springboot 的启动类，启动spring boot


junit 与spring 整合 @Contextconfiguration
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Transactional  //这个方法用于测试数据的回滚。
public class SelectAllPersonServiceTest extends MybatisApplicationTests {
        @Autowired
     SelectAllPersonMapper selectAllPersonService;




    @Test
  public void selectAllPersonServiceTest(){
   //   person.setAddress("shenzhen");
      selectAllPersonService.selectAllPerson();
  }
}
