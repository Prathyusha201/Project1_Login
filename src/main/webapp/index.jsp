<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	Login successful

    <h2>Hello, ${loggedIn_empname} Welcome to Employee Portal</h2>
    <h3>Please enter your Employee ID </h3>
    <form action = "indexservlet" method = "post"> 
    	<div class="inputBox">
            <center>
            <label >Employee ID</label>
            </center>
            <input type="text" name="empid"  
                   required/>
        </div>
      <center>
      <input type = "submit" value = "Go">
      </center>
       
        
    </form>
</body>
</html>