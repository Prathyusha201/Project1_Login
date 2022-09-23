<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<div>
		<center>
			<h1>LOGIN FORM</h1>
			<br>
			<form action="Loginservlet" method="post">
			  <div class="imgcontainer">
    <img src="Images/sopra.jpg" alt="sopra" class="avatar" width="600" height="200">
  </div>
				  <div class="container">
  <h1>Login Page</h1>
    <div><label>Employee ID : </label>
	<input type="text" name="empid" placeholder="Enter the Employee ID"></div>
	<br/>
	<div><label>Employee Name: </label>
	<input type="text" name="empname" placeholder="Enter the Employee Name"></div>
	<br/>
    <div><input type="checkbox" checked="checked" name="I am not a robot"> I am not a robot</div>
  </div>

  <div class="container" >
    <button type="submit"><div>Login</div></button>
    <p><div>If not register then <a href="register.jsp">Register here </a></div></p>
  </div>
			</form>
		</center>
	</div>
</body>
</html>