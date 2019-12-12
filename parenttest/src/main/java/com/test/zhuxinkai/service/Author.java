package com.test.zhuxinkai.service;

/**
 * <h3>parenttest</h3>
 * <p>用于测试@ControllerAdvice + @InitBinder</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-09 11:02
 **/


public class Author {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
