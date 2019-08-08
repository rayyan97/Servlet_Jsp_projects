/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Class.forName;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RAYYAN
 */
@WebServlet(name = "forgetpass", urlPatterns = {"/forgetpass"})
public class forgetpass extends HttpServlet {

  
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
     
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
            
             String name = request.getParameter("uname");
              String password = request.getParameter("pass");
        try {
          
            String url="jdbc:mysql://Localhost:3306/mydb";
            String dbname="root";
            String dbpass="9082372584";
            String query="update Login set password=? where Email = '"+name+"'";
           
            
           
            String query2="select * from Login where Email = '"+name+"'";
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,dbname,dbpass);
           Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            boolean val = rs.first();
            
            if(val){
                PreparedStatement ps1 = con.prepareStatement(query);
              
                ps1.setString(1, password);
                int count1 = ps1.executeUpdate();
               response.sendRedirect("passchange.html");
            }
            else{
            
         response.sendRedirect("passfailed.html");
               
               
            }
            
        
             
           /**/
            
        } catch (Exception ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        }
      
    }

 


