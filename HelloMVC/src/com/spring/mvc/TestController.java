package com.spring.mvc;

import com.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h3>HelloMVC</h3>
 * <p>扫描器</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-02 17:08
 **/

//返回值： String 代表ModelAndView中viewName ,视图解析器前缀和后缀之间的路径。
    @Controller
@RequestMapping("/test")  //放在类上，用于相同方法名的不同类的方法映射。
public class TestController {
    @RequestMapping("/hello.form")
        public String hello(){
        return "index";
    }


    @RequestMapping("/revParam.form")

    public String revParam(HttpServletRequest request){
        String name = null;
        name = request.getParameter("name");
        System.out.println(name);
        return "index";
    }

    @RequestMapping("/revParam1.form")
    public String revParam1(String name){
        System.out.println(name);
        return "index";
    }
    //单个参数的接受的简便方式。必须与形参对应。
    @RequestMapping("/revParam2.form")
    public String revParam2(String name, int age, String address, Date date){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(date);

        return "index";
    }
    //绑定时间类型的 属性编辑器。
   @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
}


//多选的数组名参数，必须与提交的name 对应上。不一致会报空指针。
    @RequestMapping("/favoe.form")
   public String favoe(String [] favoe){
        for(String fa: favoe){
            System.out.println(fa);
        }
     return "index";

    }
  //转发到form.jsp，以提交相应的checkbox.

    @RequestMapping("/favoefront.form")
    public String favoefront(){
        return "form";
    }

    //接收实体类对象时，参数必须与Person 对象的属性相对应。变量名不需要关心

    @RequestMapping("/person.form")
    public String person(Person person){
        System.out.println(person);
        return "index";

    }





}
