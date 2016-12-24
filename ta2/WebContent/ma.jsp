<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%
	HttpSession session = null;
	/* session = request.getSession(true); */
	//서버에 세션이 없으면 만들어서 반환, 있으면 기존것 반환
	session = request.getSession(false);
	//서버에 세션이 없으면 null 반환한 값 있으면 기존 것 반환
	if(session == null){
		response.sendRedirect("login.html");
		return;
	}
	if(session.getAttribute("id") == null){
		response.sendRedirect("login.html");
		return;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
회원전용페이지<br>
id : <%=session.getAttribute("id") %>
name : ${name }<br>
</body>
</html>