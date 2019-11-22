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
    //<!--在html  的表单中如果使用的是post 方法，那么servlet 则使用doPost方法。-->

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求的字符集
        request.setCharacterEncoding("utf-8");
        //设置相应的文本类型
        response.setContentType("text/html;charset=utf-8");

        //数据库工具类
        MysqlTool to=new MysqlTool();

        //通过request的 getParameter 方法获取到相应的前端传过来的值，这里以input 中的name 来对应

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String brithday=request.getParameter("brithday");
        String sex=request.getParameter("sex");
        //判断，如果在输入的值其中一个是空的话(用的逻辑或判断，那么重定向到前端首页位置。利用reponse.sendRedirect

        if(username==null||password==null||brithday==null||sex==null){
            response.sendRedirect("index.html");
        }else{

            System.out.println(username+"\t"+password+"\t"+brithday+"\t"+sex);
            //定义了sql预查询语句
            String sql1="select id from javatest where username=?";
            //定义了查询对象数组。
            Object[] objs1={username};

            // 调用了工具类的query 方法。

            ResultSet rs=to.query(sql1, objs1);
            try {
                // rs 是进行查询后的Result结果集，他的next方法，如果为true 的话，说明他是有值的。
                if(rs.next()){
               // if(rs != null){
                     response.sendRedirect("userhad.html");
                 }else{
                    //开始注册，写注册的insert 预先处理语句。

                     String sql2="insert into javatest(username,password,brithday,sex)values(?,?,?,?)";
                     //定义，进行注册的值对象
                     Object[] objs2={username,password,brithday,sex};

                     //调用工具类的update 方法，对数据库进行更新，返回一个整数值。

                     int a=to.update(sql2,objs2);
                     /*在工具类中，a的值是 PreparedStatment 的方法 executeUpdate() 的返回值。
                        返回值表示的是SQL数据库操作语言DML语句操作到数据库的行计数。
                        如果为0 则表述没有匹配到可操作的行。

                      */


                     if(a>0){
                         request.getRequestDispatcher("registersuccess.html").forward(request, response);
                        // response.sendRedirect("index.html");
                     }else{
                         request.getRequestDispatcher("register.html").forward(request, response);
                        // response.sendRedirect("register.html");
                     }
                 }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
