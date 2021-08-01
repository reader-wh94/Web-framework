<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<% request.setCharacterEncoding("euc-kr"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enroll subjects</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/table.css?ver=3">
</head>
<body>
<h2>2021년 1학기 수강 신청</h2>
<sf:form method="post" action="${pageContext.request.contextPath}/createsubject" modelAttribute="subject">
	<table class="formtable" >
		<tr><td class="label">년도: </td>
			<td><sf:input class="control" type="text" path="year" /> <sf:errors path="year" class="error" /> </td>
		</tr>
		<tr><td class="label">학기: </td>
			<td><sf:input class="control" type="text" path="semester" /> <sf:errors path="semester" class="error" /> </td>
		</tr>
		<tr><td class="label">교과목명: </td>
			<td><sf:input class="control" type="text" path="name" /> <sf:errors path="name" class="error" /> </td>
		</tr>
		<tr><td class="label">교과구분: </td>
			<td><sf:input class="control" type="text" path="category" /> <sf:errors path="category" class="error" /> </td>
		</tr>
		<tr><td class="label">담당교수: </td>
			<td><sf:input class="control" type="text" path="professor" /> <sf:errors path="professor" class="error" /> </td>
		</tr>
		<tr><td class="label">학점: </td>
			<td><sf:input class="control" type="text" path="grade" /> <sf:errors path="grade" class="error" /> </td>
		</tr>
		<tr> <td> </td> <td><input type="submit" value="등록"> </td> </tr>
	</table>
</sf:form>
</body>
</html>