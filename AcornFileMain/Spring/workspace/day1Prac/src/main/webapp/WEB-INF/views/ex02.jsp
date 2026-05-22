<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="item" items="${data}">
${item} <br>
	</c:forEach>



	<%
	String[] list = (String[]) request.getAttribute("data");
	%>
	<%
	for (int i = 0; i < list.length; i++) {
	%>
	<p>
		<%=list[i]%></p>
	<%
	}
	%>
</body>
</html>
