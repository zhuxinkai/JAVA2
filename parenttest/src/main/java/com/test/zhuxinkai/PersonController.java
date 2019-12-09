package com.test.zhuxinkai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PersonController {
    @GetMapping("/person")

    public Person person(){
        Person person = new Person();
        person.setName("zhuxinkai");
        person.setAddress("china-shenzhen");
        person.setAge(37);
        person.setPublicationDate(new Date());

        return person;


    }


}
