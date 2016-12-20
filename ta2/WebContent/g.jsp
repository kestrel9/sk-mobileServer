<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
내장객체 예제<br>
<%
	int num = 0;
	num = 10;
	out.println("aaa");
	
	String path = application.getRealPath(".");
	
	ServletContext application1 = request.getServletContext();
%>

path = <%=path %><br>
</body>
</html>