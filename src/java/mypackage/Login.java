/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RAYYAN
 */

public class Login extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
       
        try {
            String name = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            DAO obj = new DAO();
            
            if(obj.check(name,pass)){
                HttpSession session = request.getSession();
                session.setAttribute("n",name);
                response.sendRedirect("category.jsp");
            }
            else{
                response.sendRedirect("error.html");
             
            }
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        }
        
        
    }

   

