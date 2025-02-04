<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>list 출력</title>
	</head>
	<body>
	<h2>데이터 출력</h2>
	<div>count 출력: ${param.count}</div>
	
	<hr>
	<c:forEach items="${list}" var="member" varStatus="vs"> <%-- list값을 member에 넣어주기 --%>
		<div>데이터 ${vs.index} : ${member.id},${member.name}</div>
	</c:forEach>
	
	</body>
</html>