<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2021-1</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/table.css?ver=3">
</head>
<body>
<h2>2021년 1학기 수강 신청 내역</h2>
<table>
	<tr><td>년도</td><td>학기</td><td>교과목명</td><td>교과구분</td><td>담당교수</td><td>학점</td></tr>
	<c:forEach var="subject" items="${subjects}">
		<tr><td><c:out value="${subject.year }"></c:out></td><td><c:out value="${subject.semester }"></c:out></td>
			<td><c:out value="${subject.name }"></c:out></td><td><c:out value="${subject.category }"></c:out></td>
			<td><c:out value="${subject.professor }"></c:out></td><td><c:out value="${subject.grade }"></c:out></td></tr>	
	</c:forEach>
</table>
</body>
</html>