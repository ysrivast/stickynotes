<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sticky Notes</title>
</head>
<body>
<h1>Welcome to Sticky Notes</h1>
	<form action="userLogin" method="get">
		<h4>Click here for login</h4>
		<br>
		<input type="Submit" name="loginButton" value="Login">
		<input type="hidden" name="hiden" value="hidden">

	</form>
	<form action="userSignup" method="get">
		<h4>Click here for Register</h4>
		<br>
		<input type="Submit" name="loginButton" value="Register">
		<input type="hidden" name="hiden" value="hidden">
	</form>
</body>
</html>