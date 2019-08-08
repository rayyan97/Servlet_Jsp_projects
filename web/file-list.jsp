<%-- 
    Document   : file-list
    Created on : Jul 23, 2019, 7:55:44 PM
    Author     : RAYYAN
--%>

<%@page import="mypackage.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>


<html>
    <head>
         <link  rel="stylesheet" href="css/newcss.css" >
        <%
         response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");      
             response.setHeader("Pragma","no-cache");      
             response.setHeader("Expires","0");     
            if(session.getAttribute("n")== null){
                response.sendRedirect("index.html");
                
    }%>
        <style>
            tr,td,th{
                padding: 20px;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <br><br><br>
    <center>
        <%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
        <table border="2">
            <tr>
                <th>ID</th><th>First Name</th><th>Last Name</th><th>File Name</th><th>File Path</th><th>Added Date</th><th>Download</th>
            </tr>
            <%
                con = DB.getConnection();
            String sql = "select * from data";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getTimestamp(6)%></td>
                <td><a href="DownloadServlet?fileName=<%=rs.getString(4)%>">Download</a></td>
            </tr>
            <%
                }
            %>
            
        </table><br><br>
        <form action="Logout1" method="post">
            <input type="submit" value="Logout" class="button">
        </form>
    </center>
    </body>
</html>

