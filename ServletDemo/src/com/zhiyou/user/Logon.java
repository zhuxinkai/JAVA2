//Logon 登录servlet类
package com.zhiyou.user;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou.jdbcTest.MysqlTool;


@WebServlet("/Logon")
public class Logon extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        MysqlTool to=new MysqlTool();

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if(username==null||password==null){
            //重新登录
            System.out.println("账号或密码错误！");
            response.sendRedirect("logon.html");
        }else{
            String sql="select * from javatest where username=? and password=?";
            Object[] objs={username,password};
            ResultSet rs= to.query(sql, objs);
            try {
                if(rs.next()){
                    //登陆成功，跳转到success页面
                    System.out.println("登陆成功！！");
                    request.getRequestDispatcher("success.html").forward(request, response);
                    /*response.sendRedirect("success.html");*/
                }else{
                    System.out.println("账号或密码错误！");
                    response.sendRedirect("logon.html");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
