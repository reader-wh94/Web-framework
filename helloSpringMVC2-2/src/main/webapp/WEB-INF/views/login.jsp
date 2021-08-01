<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Please sign in(Custom Login Form)</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css?ver=3">
  </head>
  <body>
      <form class="form" method="post" action="<c:url value="login"/>">
        <h2>Please sign in</h2>
        <c:if test="${not empty errorMsg}">
        	<div style="color:#ff0000"><h4>${errorMsg}</h4> </div>
        </c:if>
        <c:if test="${not empty logoutMsg}">
        	<div style="color:#0000ff"><h4>${logoutMsg}</h4> </div>
        </c:if>
        	<div class="id">
        		<input type="text" id="username" name="username" class="control" placeholder="Username" required autofocus>
        	</div>
			<div class="pw">
          		<input type="password" id="password" name="password" class="control" placeholder="Password" required>
      		</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        	<button class="btn" type="submit">Sign in</button>
      </form>
</body>
</html>