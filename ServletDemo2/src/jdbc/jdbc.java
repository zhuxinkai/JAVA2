package jdbc;

import com.mysql.jdbc.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class jdbc {
    public static Connection getConnection() throws SQLException,
            ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://139.199.198.206:33278/javatest";
        String username = "root";
        String password = "Zxk.975957";
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        return con;

    }
}
