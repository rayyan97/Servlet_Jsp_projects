<%-- 
    Document   : index.jsp
    Created on : Jul 23, 2019, 7:55:00 PM
    Author     : RAYYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link  rel="stylesheet" href="css/newcss.css" >
    </head>
    <%
     response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");      
             response.setHeader("Pragma","no-cache");      
             response.setHeader("Expires","0");     
            if(session.getAttribute("n")== null){
                response.sendRedirect("index.html");
                
    }
    
    %>
    <body>
        <br><br><br><br>
    <center>
        
        <form action="UploadServlet" method="post" enctype="multipart/form-data">
            <table width="400px" align="center" border=2>
                <tr>
                    <td align="center" colspan="2">Form Details</td>
                </tr>
                <tr>
                    <td>First Name </td>
                    <td>
                        <input type="text" required="" name="firstname">
                    </td>
                </tr>
                <tr>
                    <td>Last Name </td>
                    <td>
                        <input type="text" required="" name="lastname">
                    </td>
                </tr>
                <tr>
                    <td>Select File </td>
                    <td>
                        <input type="file" required="" name="file">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>

        </form>
        <br><a href = "file-list.jsp">View List</a>
    </center>
</body>
</html>

