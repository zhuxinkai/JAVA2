package com.test.zhuxinkai;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.SpringApplication;

import java.util.Date;

public class Person {
   private String name;
   private String address;
//   @JsonIgnore
   //字段忽略，在此例中忽略age字段。

    private Integer age;
   //利用JsonFormat进行日期格式化。
 // @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
