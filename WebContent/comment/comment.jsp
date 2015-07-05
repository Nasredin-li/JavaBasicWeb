<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Comment</title>
</head>
<body>
<form method="post">
	<H1>Hello, who are you?</H1>
	<label for="username">Name:</label>
	<input id="username" name="username" autofocus placeholder="username">
	<textarea id="textcomment" name="textcomment" autofocus placeholder="your comment"></textarea>
	<input type="submit" value="Enter">
</form>

 
</body>
</html>