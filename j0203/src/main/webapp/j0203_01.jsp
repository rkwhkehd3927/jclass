<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp</title>
		<style>
			table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	<h2>Jin 웹페이지 오픈</h2>
	<table>
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
	</table>
	<form action="./HelloW" method="get">
		<input type="submit" value="전송">
	</form>
	</body>
</html> 