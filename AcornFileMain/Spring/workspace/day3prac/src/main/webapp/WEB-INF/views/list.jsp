<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<a href="<%= request.getContextPath()%>/register">Register</a>
<br>
<br>

<c:forEach var="member" items="${list}">
	${member.id}
	${member.pwd}
	${member.name}
	<br>
</c:forEach>

</body>
</html>
