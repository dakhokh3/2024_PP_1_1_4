package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Util {
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/my_schema";

    private static final Logger log = Logger.getLogger(Util.class.getName());


    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            log.info("\u001B[32m" + "������� ����� ����������� � ��" + "\u001B[0m");
            return connection;
        } catch (SQLException e) {
            log.log(Level.SEVERE, "������ ��� �������� ����������� � ��:", e);
            throw new RuntimeException(e);
        }

    }
}
