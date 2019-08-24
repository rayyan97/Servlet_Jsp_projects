<%-- 
    Document   : category
    Created on : Jul 27, 2019, 9:15:53 PM
    Author     : RAYYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/catcss.css">
	<title></title>
</head>
<body>
     <%
         response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");      
             response.setHeader("Pragma","no-cache");      
             response.setHeader("Expires","0");     
            if(session.getAttribute("n")== null){
                response.sendRedirect("index.html");
                
    }%>
    
    
	<center>
           
	<div id="box"> <h1>Bsc.IT</h1>
		<div class="inner">
			<div id="sem1">
				<h2><a href="file-list.jsp">Sem-1</a></h2>
			</div>

		</div><br>

		<div class="inner">
			<div id="sem2">
				<h2><a href="page.jsp">Sem-2</a></h2>
			</div>

		</div><br>
		<div class="inner">
			<div id="sem3">
				<h2><a href="page.jsp">Sem-3</a></h2>
			</div>

		</div><br>
		<div class="inner">
			<div id="sem4">
				<h2><a href="page.jsp">Sem-4</a></h2>
			</div>

		</div><br>
		<div class="inner">
			<div id="sem5">
				<h2><a href="page.jsp">Sem-5</a></h2>
			</div>

		</div><br>
		<div class="inner">
			<div id="sem6">
				<h2><a href="page.jsp">Sem-6</a></h2>
			</div>

		</div><br>
                
         <form action="Logout1" method="post">
            <input type="submit" value="Logout" class="button">
        </form>
	</div>
            
          
</center>
</body>
</html>