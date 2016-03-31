<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">
<title>Moovies Rent Club</title>
</head>
<body>

<div class="container">

    <h1> ${username.getUser()}'s Movies</h1>
    
    <div class="logout"> 

        <form action="Login" method="get" >
		<input type="submit" value="Logout" id="logout" />
		</form>
    </div>    

    <div class="searchBar">
        <form action="Search" method="post" id="formSearch">
            <input type="text" name="txtSearch" id="inputSearch" placeholder="Type your movie"/>
            <span></span>
            <button  type="submit" id="btnSearch">Search</button>
        </form>
    </div>

    <div class="moviesTable">
        <table id="dataTable">
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
    </div>

    <div class="formAddMovie">		

        <form action="Movies" method="post"  id="formAddMovie">
            
                <h3>Add A new Movie</h3>
            
                    <label>Movie</label><br>
                    <input type="text" name="txtMovie" id="inputMovie" placeholder="Movie"/><br>
                    	
                    <label>Release Year</label><br>
                    <input type="text" name="txtRelease" id="inputRelease" placeholder="Year"/><br>
                    	
            	   <button type="button" id="btnAdd">Add Movie</button>
        </form>
    </div>


    
</div>        

<script type="text/javascript" src="<c:url value="/resources/js/jquery.js"></c:url>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/main.js"></c:url>"></script>
</body>
</html>