package pl.coderslab.entity;

import java.sql.*;

public class DbUtil {

    private static String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
    private static String DB_USER = "root";
    private static String DB_PASS = "coderslab";

    public static Connection getConection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

}
