<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sticky Notes Login</title>
</head>
<body>

<h1><marquee> ${timestamp} </marquee></h1>
	<div>
		<p style="color: red">${errorMessage}</p>
	</div>
		<a href="http://localhost:9999/"> Home</a>
	<br>
	<form action="userLogin" method="POST">
		UserName : <br> <input type="text" name="uname"> <br>
		Password : <br> <input type="text" name="pwd"> <br>
		Submit : <input type="submit" value="Submit">
	</form>
</body>
</html>