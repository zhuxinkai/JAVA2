package com.spring.model;

/**
 * <h3>HelloMVC</h3>
 * <p>model</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-02 14:33
 **/


public class Person {
    private String name;
    private int id;
    private String address;
    private int gender;
    private int age;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
