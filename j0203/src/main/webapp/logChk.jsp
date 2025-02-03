<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<!-- html 주석: 소스보기하면 나타남 -->
	<%-- jsp 주석: 소스보기해도 안나타남 --%>
	
	<!-- 저장되었는지, 삭제되었는지 출력 // 개망했다 쌰갈 -->
	
		<% 
		
		String id = request.getParameter("id");
		String[] saveId = request.getParameterValues("saveId");
		if(saveId != null){
			Cookie cookie = new Cookie("cook_id",id); // 쿠키 id 저장 객체 생성
			cookie.setMaxAge(60*60*24*365);
			response.addCookie(cookie); // 쿠키 저장
		}
		%>
		
			<div><%= saveId[0] %> (이)가 저장되었습니다.</div>
			<%}else{
				Cookie[] cookies = request.getCookies(); // 쿠키 삭제
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("cook_id")){
						cookie.setMaxAge(0); // 삭제
						response.addCookie(cookie); // 쿠키 저장
					}
				}
						
			%>
			<div> 쿠키에 저장되어 있는 cook_id (이)가 삭제되었습니다.</div>
		<%}%>
	<div>정보: <%= saveId %></div>	
		<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	
	
	
	</body>
</html>