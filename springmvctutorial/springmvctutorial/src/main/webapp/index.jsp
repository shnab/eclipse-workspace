<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Tutorial</title>
</head>
<body>
	<h> Welcome to Spring MVC Course... </h>
	<p> 
	Spring Boot is making easy project creation
	</p>
	
<!--  	<h1> Get two integers from user ... </h1>
	<form action="add">
	Enter first number: <input type="text" name="n1">
	<br><br><br><br>
	Enter second number: <input type="text" name="n2">
	<br><br><br><br>
	<input type="submit">
	</form> -->

<!-- 	<h1>Add new student</h1>
	<form action = "addStudents", method ="post">
	Enter student id: <input type="text" name = "name">
	<br><br><br>
	Enter student name: <input type="text" name = "name">
	<br><br><br><br>
	<input type="submit">
	</form> -->
	
		<h1> Get all students ...</h1>
	<!--  <form action = "getStudents", method ="get">
	</form>
	-->
	
	<h1>Get a specific student by using id .. </h1>
		<form action = "getStudentWithId", method ="get">
		Enter student id to get student information: <input type= "text" name= "id">
		<br> <br>
		<input type="submit">
	</form>
</body>
</html>