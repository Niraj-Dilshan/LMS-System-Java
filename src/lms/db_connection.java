/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author niraj
 */
public class db_connection {
    
    static private Connection con;
    
    public static Connection getCon()throws Exception{
        if (con==null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
        }
        
        return con;
    }
    
    public static void setData(String s)throws Exception{
        db_connection.getCon().createStatement().executeUpdate(s);
    }
    
    public static ResultSet getData(String s)throws Exception{
        return db_connection.getCon().createStatement().executeQuery(s);
    }
    
}
