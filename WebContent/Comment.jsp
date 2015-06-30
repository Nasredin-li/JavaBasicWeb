<!DOCTYPE html >
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Comment Page</title>
    <link rel="stylesheet" href="note.css">
</head>
<body>
	<form method="post">
		<label>Enter comment: </label>
		<textarea name="comment" id="comment"></textarea>
		<input type="submit" value="add">
	</form>
	<p>
		Hello, bear!
		${text}
		<a href="comment"></a>
	</p>
</body>
</html>