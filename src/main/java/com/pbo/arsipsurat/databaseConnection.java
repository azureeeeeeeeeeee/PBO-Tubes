/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.arsipsurat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Reno
 */
public class databaseConnection {
    Connection dbConection;

    public Connection getConnection() {
        String databaseUser = "root";
        String databasePassword= "";
        String url = "jdbc:mysql://localhost:3306/arsipsurat";
                try {
//                    Class.forName("com.mysql.cj.jdbc.Driver");
                    dbConection = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e) {
                    e.printStackTrace();
                    e.getCause();
        }
        return dbConection;
    }
}
