<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
 <div> <center>
    <h1>Register Form</h1><br>
    <form action="Registerservlet" method = "post">
        
        <div class="imgcontainer">
    <img src="Images/sopra.jpg" alt="sopra" class="avatar" width="600" height="200">
  </div>
	
  <div class="container">
  <h1>Registration Form</h1>
    <div><label>Employee ID : </label>
	<input type="text" name="empid" placeholder="Enter the Employee ID"></div>
	<br/>
	<div><label>Employee Name: </label>
	<input type="text" name="empname" placeholder="Enter the Employee Name"></div>
	<br/>
	<div><label>Contact Number: </label>
	<input type="text" name="empcontact" placeholder="Enter the Contact number"></div>
	<br/>
	<div><label>Email: </label>
	<input type="email" name="empemail" placeholder="Enter the Mail ID"></div>
	<br/>
    <div><input type="checkbox" checked="checked" name="I am not a robot"> I am not a robot
  </div>
  </div>

  <div class="container">
    <button type="submit"><div>Register</div></button>
    <button type="button" class="cancelbtn"><div>Cancel</div></button>
  </div>
        
    </form>
    </center></div>
	
</body>
</html>