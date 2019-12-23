package com.buhuixiu.www.demo.controller;

import com.buhuixiu.www.demo.dao.MysqlTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;




@RestController

//@WebServlet("/login")
public class SevletForZyhPerson extends HttpServlet {
    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
    @RequestMapping(value = "/login1")
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        MysqlTool to= new MysqlTool();

        String username = req.getParameter("username");
        String password = req.getParameter("pwd");
        System.out.println(username);
        System.out.println(password);
 /*
        if(username.equals("zhuyonghan")){
            resp.getWriter().print("ok");

        }else{
            resp.getWriter().print("error");
            System.out.println("用户名不等于zhuyonghan);
        }



 */

        if(username == null || password == null){
            //重新登录
            System.out.println("用户没有输入账号密码");
            resp.sendRedirect("login.html");


        }else{
            String sql="select * from tb_user where username=? and password=?";
            Object[] objs={username,password};
            ResultSet rs= to.query(sql, objs);
            try {
                if(rs.next()){
                    //登陆成功，跳转到success页面
                    System.out.println("登陆成功！！");
                    req.getRequestDispatcher("index.html").forward(req, resp);
                    /*response.sendRedirect("success.html");*/
                }else{
                    resp.getWriter().print("账户或密码错误");
                    System.out.println("账号或密码错误！");
                    resp.sendRedirect("login.html");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }



    }

}
