/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RAYYAN
 */
public class admincheck extends HttpServlet {

   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
         response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");      
             response.setHeader("Pragma","no-cache");      
             response.setHeader("Expires","0");    
             HttpSession session = request.getSession();
             
             
             String admin = request.getParameter("uname");
             String password = request.getParameter("pass");
              session.setAttribute("n",admin);
         
           if(admin.equals("admin") && password.equals("admin")){
               
            response.sendRedirect("up_page.jsp");
            
}
           else{
               response.sendRedirect("file-list.jsp");
           }

    }

}
