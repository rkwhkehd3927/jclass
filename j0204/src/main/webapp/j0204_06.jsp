<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>페이지</title>
		<style>
			h2{text-align: center;}
			table,th,td{border:1px solid black; border-collapse: collapse;}
			table{width:900px; margin:10px auto;}
			th,td{height:40px; text-align: center;}
		</style>
	</head>
	<body>
	<h2>리스트 출력</h2>
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>취미</th>
		</tr>
		
		<c:forEach items="${list}" var="mem">
			<tr>
				<td>${mem.id}</td>
				<td>${mem.name}</td>
				<td>${mem.hobbies}</td>
			</tr>
		</c:forEach>
	</table>
	
	<hr>
	<h2>홍길동 회원 정보</h2>
	<form>
		<label>아이디</label>
		<input type="text" name="id" value="${list[0].id}"><br/>
		<label>이름</label>
		<input type="text" name="name" value="${list[0].name}"><br/>
		<label>취미</label><br/>
		<input type="checkbox" id="game" name="hobbies" value="게임"><br/>
		<c:if test="${fn:contains(list[0].hobbies,'게임')}">checked</c:if>
		<label for="game">게임</label>
		<input type="checkbox" id="golf" name="hobbies" value="골프"><br/>
		<c:if test="${fn:contains(list[0].hobbies,'골프')}">checked</c:if>
		<label for="golf">골프</label>
		<input type="checkbox" id="swim" name="hobbies" value="수영"><br/>
		<c:if test="${fn:contains(list[0].hobbies,'수영')}">checked</c:if>
		<label for="swim">수영</label>
		<input type="checkbox" id="run" name="hobbies" value="조깅"><br/>
		<c:if test="${fn:contains(list[0].hobbies,'조깅')}">checked</c:if>
		<label for="rum">조깅</label>
		<input type="checkbox" id="read" name="hobbies" value="독서"><br/>
		<c:if test="${fn:contains(list[0].hobbies,'독서')}">checked</c:if>
		<label for="read">독서</label>
		<br/>
		
	</form>
	</body>
</html>