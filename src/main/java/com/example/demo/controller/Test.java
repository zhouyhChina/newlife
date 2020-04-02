package com.example.demo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.sql.*;


public class Test {
    public static int a = 1;
    public static void main(String[] args) throws SQLException {
      /*  AnnotationConfigWebApplicationContext aw=new AnnotationConfigWebApplicationContext(RedisConfig.class);
        RedisConfig rc= (RedisConfig) aw.getBean("redisConfig");
        rc.test();*/
  /*      DispatcherServlet ds=new DispatcherServlet();
        Connection con = DriverManager.getConnection("jdbc:mysql://mcip:3306/study","root","123456");
        //创建语句
        Statement statement = con.createStatement();
        //指定sql并执行
        ResultSet resultSet = statement.executeQuery("select * from user");
        //循环遍历结果集
        while (resultSet.next()){
            //处理每条数据
            System.out.println(resultSet.getString("user_id")+"-"+
                    resultSet.getString("user_name"));
        }
        //关闭连接
        con.close();*/



    }
}
