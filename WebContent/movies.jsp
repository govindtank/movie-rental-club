<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Moovies Rent Club</title>
</head>
<body>

<h1> ${username.getUser()}'s Movies</h1>

<input type="text" name="txtSearch" id="inputSearch" placeholder="Search"/>
<button  type="submit">Search</button>

<table border="1" width="100%" id="tablaDatos">
		<tr>
			<th>Name</th>
			<th>Release Year</th>
		</tr>
	<c:forEach  items="${movie}" var="m">
		<tr>
			<td>${m.getName()}</td>	
			<td>${m.getReleaseYear()}</td>

		</tr>

	</c:forEach>

</table>

		<form action="" method="post" onsubmit="">
            <table border="0" cellspacing="2" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Add A new Movie</th>
                    </tr>
                </thead>
                	<tbody>
                    	<tr>
                        	<td><label>Movie</label></td>
                        	<td><input type="text" name="txtMovie" id="inputMovie"/></td>
                    	</tr>
                    	<tr>
                        	<td><label>Release Year</label></td>
                        	<td><input type="text" name="txtRelease" id="inputRelease"/></td>
                    	</tr>
                    	<tr>
                         	<td><input type="submit" value="Add" id="btnAdd"  /></td> 
                   	 	</tr>
                	</tbody>
            	</table>
        </form>


</body>
</html>