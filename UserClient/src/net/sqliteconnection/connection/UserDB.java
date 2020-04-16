package net.sqliteconnection.connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDB {
    public void storeUser(String userName, String[] userInfo) {
        Connection conn = null;
        try {
            // db parameters for local connection
        	// change url to connect to the directory of UserDataBase.db
            String url = "jdbc:sqlite:C:/sqlite/db/UserDataBase.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            Statement myStmt =  conn.createStatement();
            
            String sql = "insert into User "
            		+ " (username, password, firstname, lastname, address , email) " 
            		+ " values ('"+ userInfo[0] + "','" + userInfo[1] + "','" + userInfo[2] + "','"
            		+ userInfo[3]+ "','" + userInfo[4] + "','" + userInfo[5] +"')";
            
            myStmt.executeUpdate(sql);
            
            System.out.println("Account creation success.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}