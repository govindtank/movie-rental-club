<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Moovies Rent Club</title>
</head>
<body>
 <h1>Moovies Rent Club</h1>
 
 
<form action="Login" method="post" >
            <table border="0" cellspacing="2" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Moovies Login</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label>User</label></td>
                        <td><input type="text" name="txtUser" id="userInput"/></td>
                    </tr>
                    <tr>
                        <td><label>Password</label></td>
                        <td><input type="password" name="txtPassword" id="passInput"/></td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" value="Log-in" id="btnSend"  /></td> 
                        
                    </tr>
                </tbody>
            </table>
            
            
        </form>

<script type="text/javascript" src="<c:url value="/resources/js/jquery.js"></c:url>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/main.js"></c:url>"></script>
</body>
</html>