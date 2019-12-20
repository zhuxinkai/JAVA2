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
@WebServlet("/money")
public class Money extends HttpServlet {






        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req,resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            MysqlTool to= new MysqlTool();

        //    String username = req.getParameter("username");
            String password = req.getParameter("money");
            String sql1="select * from reason where password=?";
            Object[] objs1={password};
            ResultSet rs = to.query(sql1,objs1);
            try {
                if(rs.next()){
                    rs = to.query(sql1,objs1);
                    Double totalymoney = 0d;
                    while (rs.next()) {

                        Double money = rs.getDouble("addmoney");
                        Double reduce = rs.getDouble("reducemoney");

                        totalymoney += money;


                    }
                    PrintWriter out = resp.getWriter();
                    out.println("<h1>" + "朱勇涵小朋友你的存款是: "+totalymoney+ " 元人民币");
                }
                else{
                    PrintWriter out2 = resp.getWriter();
                    out2.println("<h1>"+"账号密码错误");
                    //Thread.sleep(1000);
                    System.out.println("账号或密码错误！");
                   // resp.sendRedirect("login.html");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


}
