package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCrud {
    static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String insertUsers="INSERT INTO users1 VALUES (21, 'Alice', 22,90)";
            int rowsInserted=stmt.executeUpdate(insertUsers);
            System.out.println("rows inserted: "+rowsInserted);



            /*----------------execute query()-----------*/
            ResultSet resultSet = stmt.executeQuery("select*from users1");
            System.out.println("users data");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + " " +
                                resultSet.getString("name") + " " +
                                resultSet.getInt("age") + " " +
                                resultSet.getInt("marks")
                );
            }

            /*---------------boolen execute()-----------*/

            boolean flag=stmt.execute("select*from users1");
            if(flag){
                ResultSet resultSet1=stmt.getResultSet();
                System.out.println("using execute()");
                while (resultSet1.next()){
                    System.out.println(resultSet1.getString("name"));
                }

            }else {
                int updateCount= stmt.getUpdateCount();
                System.out.println("update count: "+updateCount);
            }

            stmt.addBatch("INSERT INTO users1 VALUES (10, 'Bob', 25,36)");
            stmt.addBatch("INSERT INTO users1 VALUES (8, 'Charlie', 30,56)");
            stmt.addBatch("UPDATE users1 SET age = 26 WHERE id = 2");

            int []batchResult=stmt.executeBatch();
            System.out.println("using executeBatc()");
            for (int c:batchResult){
                System.out.println(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
