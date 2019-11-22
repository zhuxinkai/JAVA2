import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.user;
import userdao.userdao;

/**
 * Servlet implementation class RegistServlet
 */
public class RegistServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username=request.getParameter("name");
        String password=request.getParameter("password");
        user u=new user();
        u.setName(username);
        u.setPassword(password);
        userdao us=new userdao();
        boolean t = false;
        try {
            t=us.insert(u);
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(t==true){
            response.sendRedirect("/Servlet2/form.html");
        }else{
            response.sendRedirect("/Servlet2/regist.html");
        }


    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
