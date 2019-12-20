package com.zhuyonghan.jdbc;

import com.zhuyonghan.jdbc.MysqlTool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zhuyonghan.jdbc.MysqlTool;


@WebServlet("/login")
public class SevletForZyhPerson extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        MysqlTool to= new MysqlTool();

        String username = req.getParameter("username");
        String password = req.getParameter("pwd");
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
