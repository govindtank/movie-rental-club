<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">
<title>Moovies Rent Club</title>
</head>
<body>

<div class= "container">
    
    <div class="formLogin">
        <h1>Moovies Rent Club</h1>
 
 
            <form action="Login" method="post" id="formLogin">
                
                            <h3>Moovies Login</h3>
                        
                           <input type="text" name="txtUser" id="userInput" placeholder="user"/>
                      
                           <input type="password" name="txtPassword" id="passInput" placeholder="password"/>
                    
                		   <button type="button" id="btnLogin">Login</button>
            
            </form>
    </div>    
</div>        

<script type="text/javascript" src="<c:url value="/resources/js/jquery.js"></c:url>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/main.js"></c:url>"></script>
</body>
</html>