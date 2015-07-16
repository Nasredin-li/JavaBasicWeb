<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Comment</title>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  	<link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
	<script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="comm.css">
</head>
<body>
<div class="container">
<form method="post">
	<H2>Hello, who are you?</H2>
	<label for="username">Name:</label>
	<input id="username" name="username" autofocus placeholder="username"></br>
	<textarea id="textcomment" name="textcomment" autofocus placeholder="your comment"></textarea>
	<input type="submit" id="send" value="Enter">
</form>
</div>
</br></br>
<div class="container">
  ${notesList}
</div>
  

 
</body>
</html>