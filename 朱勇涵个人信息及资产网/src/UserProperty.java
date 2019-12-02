
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
import java.util.Date;

@WebServlet("/property")
public class UserProperty extends HttpServlet {


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
        String password = req.getParameter("property");
        String sql1="select * from reason where password=?";
        Object[] objs1={password};
        ResultSet rs = to.query(sql1,objs1);
        try {
            if(rs.next()){
                rs = to.query(sql1,objs1);
                while (rs.next()){

                    Date date = rs.getDate("date");
                    String reason = rs.getString("reduce-reason");
                    Double addmoney = rs.getDouble("addmoney");
                    PrintWriter out = resp.getWriter();
                    System.out.print("<h1>"+"朱勇涵小朋友你在: "+date+"因为"+reason +"获得该金额");
                    out.println("<h1>"+"朱勇涵小朋友你在-- "+date+reason +"获得该金额人民币 "+addmoney);

                }

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
