<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show subjects</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/table.css?ver=3">
</head>
<body>
	<table>
		<tr><td>년도</td><td>학기</td><td>취득 학점</td><td>상세보기</td></tr>
		<tr><td>2018</td><td>1</td><td>${semester1801}</td><td><a href="${pageContext.request.contextPath}/2018_1">링크</a></td></tr>
		<tr><td>2018</td><td>2</td><td>${semester1802}</td><td><a href="${pageContext.request.contextPath}/2018_2">링크</a></td></tr>
		<tr><td>2019</td><td>1</td><td>${semester1901}</td><td><a href="${pageContext.request.contextPath}/2019_1">링크</a></td></tr>
		<tr><td>2019</td><td>2</td><td>${semester1902}</td><td><a href="${pageContext.request.contextPath}/2019_2">링크</a></td></tr>
		<tr><td>2020</td><td>1</td><td>${semester2001}</td><td><a href="${pageContext.request.contextPath}/2020_1">링크</a></td></tr>
		<tr><td>2020</td><td>2</td><td>${semester2002}</td><td><a href="${pageContext.request.contextPath}/2020_2">링크</a></td></tr>
		<tr><td>총계</td><td></td><td>${allGrade}</td><td></td></tr>
	</table>

</body>
</html>