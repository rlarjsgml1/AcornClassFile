<%@page import="com.acorn.day1prac.modelAttr.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
</head>
<body>


${kkk.id}
${kkk.pw}

<% User user  = (User) request.getAttribute("kkk"); %>
<%=user.getId() %>
<%=user.getPw() %>
</body>
</html>