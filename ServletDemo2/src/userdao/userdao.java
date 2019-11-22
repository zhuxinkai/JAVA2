package userdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import jdbc.jdbc;
import user.user;





public class userdao {
    public boolean select(user u) throws ClassNotFoundException, SQLException{
        int x=0;
        jdbc j=new jdbc();
        Connection con=j.getConnection();
        Statement stmt=(Statement) con.createStatement();
        String sql="select Name,Password from t1";
        ResultSet rs=stmt.executeQuery(sql);


        while(rs.next()){
            System.out.println(u.getName()+rs.getString(1));
            if(u.getName().equals(rs.getString(1))){
                System.out.println("能比较用户名了");
                if(u.getPassword().equals(rs.getString(2))){
                    System.out.println("匹配成功了");
                    x=1;
                    break;
                }
            }

        }
        if(x==1)
            return true;
        else
            return false;


    }

    public boolean insert(user u) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        jdbc j=new jdbc();
        Connection con=j.getConnection();
        Statement stmt=(Statement) con.createStatement();
        System.out.println("得到连接");

        String sql="insert into t1 values('"+u.getName()+"','"+u.getPassword()+"')";
        int s=stmt.executeUpdate(sql);
        if(s>0)
            return true;
        return false;
    }







}
