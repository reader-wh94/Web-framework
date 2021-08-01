<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${subject.year}년도 ${subject.semester }학기 시간표가 저장되었습니다. <br>

<a href="${pageContext.request.contextPath}/newsubject"> Click here to new subject </a>

</body>
</html>