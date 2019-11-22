import java.sql.*;

public class MySqlDemo {

    private static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
       //在连接的时候，指定编码方式，可以防止系统出现乱码。

    private static final String URL="jdbc:mysql://139.199.198.206:33278/javatest?characterEncoding=utf8";
    private static final String USER="root";
    private static final String PASSWORD="Zxk.975957";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        Statement stmt = null;
        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            //打开链接
            System.out.println("连接数据库.............");
            try {
                conn = DriverManager.getConnection(URL,USER,PASSWORD);

                System.out.println("实例化Statement 对象....");
                //进行声明

                //定义预编译查询语句
                String sql2;
                sql2 = "SELECT * FROM websites where id=? ";

                //进行语句的预编译。

                ps = conn.prepareStatement(sql2);

                //设置预编译中传递参数和传递参数的值。

                ps.setInt(1,4);

                //执行查询，获得查询后的结果集对象。

               ResultSet preparers= ps.executeQuery();

                while (preparers.next()) {
                    //通过字段进行检索

                    int id = preparers.getInt("id");
                    String name = preparers.getString("name");
                    String url = preparers.getString("url");
                    //输出数据
                    System.out.print("ID: " + id);
                    System.out.print(", 站点名称: " + name);
                    System.out.print(", 站点 URL: " + url);
                    System.out.print("\n");
                }
                System.out.println("---------------这是通过预编译获得的查询结果哦！------------------------");
                    String sql;
                sql ="SELECT id,name,url FROM websites";
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()){
                    //通过字段进行检索

                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String url = rs.getString("url");
                    //输出数据
                    System.out.print("ID: " + id);
                    System.out.print(", 站点名称: " + name);
                    System.out.print(", 站点 URL: " + url);
                    System.out.print("\n");



                }
                //进行相应的关闭。
                preparers.close();
                rs.close();
                stmt.close();
                rs.close();





            } catch (SQLException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{ if(stmt!=null) stmt.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {if(conn!=null) conn.close();


            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        System.out.println("GoodBYE");


    }


}
