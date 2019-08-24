<%-- 
    Document   : success
    Created on : Jul 23, 2019, 7:55:29 PM
    Author     : RAYYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
         <link  rel="stylesheet" href="css/newcss.css" >
    </head>
    <body>
    <center>
        <c:if test="${requestScope.msg!=null}">
        <h3><c:out value="${requestScope.msg}"></c:out></h3>
        </c:if><br><br>
        <c:if test="${sessionScope.fileName!=null}">
            <c:set var = "file" scope = "session" value = "${sessionScope.fileName}"/>  
        </c:if>
         <a href = "<c:url value = "DownloadServlet?fileName=${file}"/>">Download</a>&nbsp;&nbsp;&nbsp;
         <a href = "<c:url value = "file-list.jsp"/>">View List</a>
    </center>
    </body>
</html>
