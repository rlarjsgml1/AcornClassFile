<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h2>Register</h2>
<form action="<%= request.getContextPath()%>/regPross" method="post">
	<input type="text" name="id" maxlength="5" placeholder="id">
	<input type="text" name="pwd" maxlength="5" placeholder="pwd">
	<input type="text" name="name" maxlength="10" placeholder="name">
	<button type="submit">Register</button>
</form>
</body>
</html>
