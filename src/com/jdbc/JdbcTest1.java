package com.jdbc;

import java.sql.*;

public class JdbcTest1 {
    static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select*from users1");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id")+" "+
                        resultSet.getString("name")+" "+
                        resultSet.getInt("age")+" "+
                        resultSet.getInt("marks")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
