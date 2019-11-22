//User 注册servlet类
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


@WebServlet("/UserFrom")
public class UserFrom extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求的字符集
        request.setCharacterEncoding("utf-8");
        //设置相应的文本类型
        response.setContentType("text/html;charset=utf-8");

        //数据库工具类
        MysqlTool to=new MysqlTool();

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String brithday=request.getParameter("brithday");
        String sex=request.getParameter("sex");

        if(username==null||password==null||brithday==null||sex==null){
            response.sendRedirect("index.html");
        }else{
            System.out.println(username+"\t"+password+"\t"+brithday+"\t"+sex);
            String sql1="select id from javatest where username=?";
            Object[] objs1={username};
            ResultSet rs=to.query(sql1, objs1);
            try {
                if(rs.next()){
               // if(rs != null){
                     response.sendRedirect("register.html");
                 }else{
                     String sql2="insert into javatest(username,password,brithday,sex)values(?,?,?,?)";
                     Object[] objs2={username,password,brithday,sex};
                     int a=to.update(sql2,objs2);
                     if(a>0){
                         request.getRequestDispatcher("registersuccess.html").forward(request, response);
                        // response.sendRedirect("index.html");
                     }else{
                         request.getRequestDispatcher("registersuccess.html").forward(request, response);
                        // response.sendRedirect("register.html");
                     }
                 }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
