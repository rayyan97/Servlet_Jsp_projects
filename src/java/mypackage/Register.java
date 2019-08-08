/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author RAYYAN
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");      
             response.setHeader("Pragma","no-cache");      
             response.setHeader("Expires","0");      
        
        try {
          
            String url="jdbc:mysql://Localhost:3306/mydb";
            String dbname="root";
            String dbpass="9082372584";
            String query="insert into Login values(?,?)";
           
            
            String name = request.getParameter("uname");
            String query2="select * from Login where Email = '"+name+"'";
            String password = request.getParameter("pass");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,dbname,dbpass);
           Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            boolean val = rs.first();
            
            if(val){
                response.sendRedirect("reg_failed.jsp");
            }
            else{
            
         
                PreparedStatement ps1 = con.prepareStatement(query);
                ps1.setString(1, name);
                ps1.setString(2, password);
                int count1 = ps1.executeUpdate();
                response.sendRedirect("reg_suc.jsp");
            }
            
        
             
           /**/
            
        } catch (Exception ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }

}
