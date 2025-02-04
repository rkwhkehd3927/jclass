<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인</title>
	</head>
	<body>
	<h2>로그인확인</h2>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// 서버에 저장
		session.setAttribute("session_id", id); // session_id 에다가 id 저장
		if(id.equals("aaa") && pw.equals("1111")){
			response.sendRedirect("j0204_01.jsp");
		}else{
			response.sendRedirect("login.jsp");
		}
	
	%>
	<div>아이디 : <%= id %></div>
	<div>패스워드 : <%= pw %></div>
	
	<button onclick="javascript:location.href='j0204_01.jsp'">이동하기</button>
	</body>
</html>