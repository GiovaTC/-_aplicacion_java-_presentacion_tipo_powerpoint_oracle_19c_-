package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521/ORCLPDB";
    private static final String USER = "system";
    private static final String PASS = "Tapiero123";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
