/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
    
    String url="jdbc:mysql://Localhost:3306/mydb";
    String name="root";
    String dbpass="9082372584";
    String query = "select * from Login where Email = ? and password = ? ";
    
    public boolean check(String uname,String pass) throws Exception{
        String email = uname;
        String passwd= pass;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,dbpass);
        PreparedStatement smt = con.prepareStatement(query);
       smt.setString(1, email);
       smt.setString(2,passwd);
        ResultSet rs = smt.executeQuery();
        if(rs.next())
        {
            return true;
        }
        
    
        return false;
       }
}

