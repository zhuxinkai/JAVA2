package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.RegeisterMapper;
import com.example.mybatis.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Transactional         //这个方法用于测试数据的回滚。
class UsersServiceImplTest {
    @Autowired
    RegeisterMapper regeisterMapper;

    @BeforeEach
    void setUp() {

        System.out.println("测试开始");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void addPerson() {
        Person person = new Person();
        person.setName("zhuxinkai223");
        person.setAddress("shenzhen");
        person.setAge(15);
        person.setPassword("zxk.975957");
        regeisterMapper.insertPerson(person);
    }


}
