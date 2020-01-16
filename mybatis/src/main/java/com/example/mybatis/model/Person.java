package com.example.mybatis.model;

/**
 * <h3>mybatis</h3>
 * <p>user</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-16 14:11
 **/


public class Person {
    private String name;
    private int age;
    private String address;
    private String password;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }
}
