<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03</title>
</head>
<body>
	<h2>${dan}단</h2>
	<c:forEach var="danItem" items="${danList}">
		<p>${danItem}</p>
	</c:forEach>
</body>
</html>
