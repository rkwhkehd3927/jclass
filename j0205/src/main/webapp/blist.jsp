<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판</title>
		<style>
		 h2{text-align: center;}
		 table,th,td{border:1px solid black; border-collapse: collapse;}
		 table{width:800px; margin: 10px auto; text-align:center;}
		 th,td{height: 40px;}
		</style>
	</head>
	<body>
		<h2>게시판 리스트</h2>
		<table>
			<colgroup>
				<col width="10%">
				<col width="*">
				<col width="15%">
				<col width="15%">
				<col width="15%">
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<!-- 10번 반복 -->
<%-- 			<c:forEach var="i" begin="1" end="10" step="1">  --%>
			<c:forEach items="${list}" var="dto"> 
				<tr>
<%-- 					<td>${i}</td>	 --%>
<%-- 					<td>제목입니다 ${i}</td>	 --%>
<!-- 					<td>이름입니다</td>	 -->
<!-- 					<td>2025-02-05</td>	 -->
<!-- 					<td>100</td>	 -->
					<td>${dto.bno}</td>	
					<td>${dto.btitle}</td>	
					<td>${dto.id}</td>	
					<td>2025-02-05</td>	
					<td>${dto.bhit}</td>	
				</tr>
			</c:forEach>
			
		</table>
	</body>				
</html>