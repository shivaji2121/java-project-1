package com.jdbc;

import java.sql.*;

public class JDBCInsert {
    static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO users1 VALUES (9,'ram',22 ,40)");
            if (rs){
                System.out.println("data not inserted ");
            }else {
                System.out.println("data inserted");
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error at: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
