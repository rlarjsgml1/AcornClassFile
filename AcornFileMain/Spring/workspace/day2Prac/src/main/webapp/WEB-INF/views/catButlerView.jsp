<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고양이 집사 적합도 계산기</title>
</head>
<body>
	<!-- Controller가 Model에 담아 준 값을 EL 문법으로 출력한다. -->
	<h2>고양이 집사 적합도 계산기</h2>
	<p>놀이 시간: ${playTime}</p>
	<p>인내심: ${patience}</p>
	<p>청소 습관: ${cleaning}</p>
	<p>양육 예산: ${budget}</p>
	<p>책임감: ${responsibility}</p>
	<hr>
	<p>적합도 점수: ${score}점</p>
	<p>결과: ${grade}</p>
</body>
</html>
