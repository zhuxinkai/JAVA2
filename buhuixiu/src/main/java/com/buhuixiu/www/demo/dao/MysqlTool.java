package com.buhuixiu.www.demo.dao;
import java.sql.*;


public class MysqlTool {
    //定义数据库参数
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL="jdbc:mysql://139.199.198.206:33278/javatest?characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
    private static String USER="root";
    private static String PASSWORD="Zxk.975957";




    //创建连接对象，载体，结果集对象
    private static Connection conn=null;
    private static PreparedStatement ps=null;
    private static ResultSet rs=null;

    private static final String driver = null;


    //创建连接对象，可以直接在实例化前加载，使用静态方法

    static{
        try {
            Class.forName(JDBC_DRIVER);
            conn=  DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(conn);
            System.out.println(conn.isClosed()==false? "数据库连接成功...":"数据库连接失败...");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 增删改方法update
     * @param sql 需要执行的sql语句
     * @param objects	封装了数据的数组，需要和sql语句中的占位符一一对应
     * @return 返回影响条数，反之为0
     */
    public  int update(String sql,Object[] objects){
        int a=0;
        try {
            //创建sql载体
            ps=conn.prepareStatement(sql);

            /*利用for 循环，对相应的预处理语句中的值进行赋值。 记住相应的for 循环时从0开始，匹配长度
            但是，参数的起始索引是1，所以必须在i+1 进行处理。
             */

            for(int i=0;i<objects.length;i++){
                ps.setObject(i+1, objects[i]);
            }
            //操作SQL语句
            a=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    /**
     *
     * @param sql 需要执行的sql语句
     * @param objects	封装了数据的数组，需要和sql语句中的占位符一一对应
     * @return 封装了数据的结果集，失败返回null
     */
    public ResultSet query(String sql,Object[] objects){

        try {

            ps=conn.prepareStatement(sql);
            //给占位符赋值
            for(int i=0;i<objects.length;i++){
                ps.setObject(i+1, objects[i]);
            }
            rs=ps.executeQuery();
            //rs = ps.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public  void close(){	//关闭数据库
        try {

            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(conn!=null)
            {
                conn.close();
                System.out.println("数据库已关闭....");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
