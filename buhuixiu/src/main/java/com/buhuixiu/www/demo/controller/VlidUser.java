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
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@WebServlet("/VlidUser")
public class VlidUser  extends HttpServlet {


    @RequestMapping(value = "/VlidUser",method = RequestMethod.GET)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @RequestMapping(value = "/VlidUser")
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            MysqlTool to= new MysqlTool();

            String username = req.getParameter("username");
            String password = req.getParameter("pwd");
            String sql1="select id from tb_user where username=?";
            Object[] objs1={username};
            ResultSet rs = to.query(sql1,objs1);

        try {
            if(rs.next()){
                resp.getWriter().print("userok");

            }else{
                resp.getWriter().print("error");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
