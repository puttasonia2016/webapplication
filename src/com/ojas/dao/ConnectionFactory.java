package com.ojas.dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
	private static Connection con = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println(con + " is connected successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
