package com.example.mybatis.controller;
import com.example.mybatis.model.Person;
import com.example.mybatis.service.SelectAllPersonService;
import com.example.mybatis.service.SelectPersonService;
import com.example.mybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <h3>mybatis</h3>
 * <p>usercontroller</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-16 16:47
 **/

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UsersService usersService;  //引入服务类接口。
    @Autowired
    private SelectAllPersonService selectAllPersonService;
    @Autowired
    private SelectPersonService selectPersonService;


    @RequestMapping("/register")
    public String register() {
        return "register";

    }

    @RequestMapping("/registerhtml")
    public String registerhtml(Person persons) {

        this.usersService.addPerson(persons);
        return "success";

    }

    @RequestMapping("/findAllPersons")
    public String findAllPersons(Model model) {
        List<Person> list = this.selectAllPersonService.findAllPerson();
        model.addAttribute("list", list);
        return "findall";
    }

    @RequestMapping("/selectPerson")
    public String selectPerson(String name, Model model) {
        Person person = this.selectPersonService.selectPersonByName(name);
        if(person == null){
            return "nouser";
        }
        model.addAttribute("personback", person);
        return "selectperson";


    }

    @RequestMapping("/selectpersonfront")
    public String selectpersonfront() {
        return "selectpersonfront";
    }


    @RequestMapping("/editPerson")
    public String updatePersonByname(Person persons) {

          this.selectPersonService.updatePersonByName(persons);
                  return "successupdate";

    }

    @RequestMapping("/deletePerson")
    public String deletePersonByname(String name){

        this.selectPersonService.deletePersonByName(name);
        return "successdelete";
    }


    @RequestMapping("/delete")
    public String frontdelete(){

        return "delete";
    }
}
