package com.sistemarsipsurat.arsipsurat;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Struct;

import static java.lang.Class.forName;

public class databaseConnection {
    Connection dbConection;

    public Connection getConnection() {
        String databaseUser = "root";
        String databasePassword= "";
        String url = "jdbc:mysql://localhost:3306/arsipsurat";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    dbConection = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e) {
                    e.printStackTrace();
                    e.getCause();
        }
        return dbConection;
    }
}
