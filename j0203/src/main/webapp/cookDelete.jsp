<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장</title>
	</head>
	<body>
		<%
		String cookN = request.getParameter("cookN");
		
		Cookie[] cookies = request.getCookies(); // 모든 쿠키 가져옴, 쿠키가 한개가 아니기 때문에 "배열"로 받음
		if(cookies != null){
			for(Cookie cookie : cookies){ // cook_id, cook_pw, cook_name
				if(cookie.getName().equals(cookN)){ // 비교해서 같은게 있다면
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
			
// 			for(int i=0;i<cookies.length;i++){ // 위의 for문이랑 의미가 같은 for문
// 				if(cookies[i].getName().equals(cookN)){
// 					cookies[i].setMaxAge(0);
// 					response.addCookie(cookies[i]);
					
// 				}
// 			}
		}
		
		%>
		<div><%= cookN %> 가 삭제되었습니다.</div>
		<button onclick="javascript:location.href='./j0203_09.jsp'">페이지 이동하기</button>
	</body>
</html>